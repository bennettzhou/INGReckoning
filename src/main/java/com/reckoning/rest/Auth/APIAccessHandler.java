package com.reckoning.rest.Auth;

import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.google.gson.Gson;
import com.reckoning.rest.INGConstant;

import javax.ws.rs.WebApplicationException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class APIAccessHandler {

    private static APIAccessHandler session;

    private APIAccessHandler (){
    }

    public static APIAccessHandler getInstance () {
        if (session == null) {
            synchronized (APIAccessHandler.class) {
                if (session == null) {
                    session = new APIAccessHandler();
                }
            }
        }
        return session;
    }

    /*final OAuth10aService serviceOBP = new ServiceBuilder()
            .apiKey("pyffeedn4m4mfvfzcay00gpf3wtxlotje3fjvhcq")
            .apiSecret("k2s10ot4sie5xs51iaoyrhcuk3wryk0bw514l0mo")
            .callback("https://my-reckoning.herokuapp.com/ReckonINGExample/callBack/")
            .build(OBPApi.instance());

    private String userEndPoint = "https://apisandbox.openbankproject.com/obp/v2.0.0/users/current";
*/
    final static String userEndPoint = OBPApi.getApiEndpoint()+"/obp/v2.1.0/users/current";

    private static INGConstant INGCONSTANT = INGConstant.getInstance();

    public String getLoginPage() {

        OAuth1RequestToken requestToken;
        String authUrl = null;
        OAuth10aService serviceOBP = INGCONSTANT.getServices();
        try {
            requestToken = serviceOBP.getRequestToken();
            authUrl = serviceOBP.getAuthorizationUrl(requestToken);
            UserAuthUtil.writeCacheReqToken(requestToken);
            System.out.println("These are the request keys : ");
            UserAuthUtil.printCachebyName("req_token");
            System.out.println("This is the raw response for fetched token : "+authUrl);
            System.out.println(UserAuthUtil.readCacheReqToken(requestToken.getToken()).getRawResponse());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (OAuthException e) {
            System.out.println(" <<<>>> THERE is a AUTH EXCEPTION <<<>>>");
            e.printStackTrace();
        }

        return authUrl;
    }

    public String fetchAccessToken(String req_key, String authVerifier) {
        String status = null;
        OAuth10aService serviceOBP = INGCONSTANT.getServices();
        if (UserAuthUtil.checkCacheReqKey(req_key)) {
            try {
                System.out.println("These are the request keys : ");
                UserAuthUtil.printCachebyName("req_token");

                OAuth1AccessToken accessToken = serviceOBP.getAccessToken(UserAuthUtil.readCacheReqToken(req_key), authVerifier);
                OAuthRequest requestUser = new OAuthRequest(Verb.GET, userEndPoint);
                serviceOBP.signRequest(accessToken, requestUser);
                Response userInfoResponse = serviceOBP.execute(requestUser);
                Gson gson = new Gson();
                //== Below code is helpful to parse List of objects in Response
                //Type type = new TypeToken<List<UserInfo>>() {}.getType();
                //List<UserInfo> currentUserInfo = gson.fromJson(userInfoResponse.getBody(), type);
                UserInfo currentUserInfo = gson.fromJson(userInfoResponse.getBody(), UserInfo.class);
                UserAuthUtil.writeCacheAccToken(currentUserInfo.getUsername(), UserAuthUtil.readCacheReqToken(req_key), accessToken);
                //System.out.println(currentUserInfo.getUserId());
                //System.out.println(currentUserInfo.getUsername());


                System.out.println("This is the raw response for ACCESS token : ");
                System.out.println(accessToken.getRawResponse());
                System.out.println("This is user info : ");
                System.out.println(userInfoResponse.getCode());
                System.out.println(userInfoResponse.getBody());
                System.out.println("These are the access keys : ");
                UserAuthUtil.printCachebyName("acc_token");

                status = "success";

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        } else {
            status = "failure";
        }

        return status;
    }

    public synchronized String getAPIResponse(String username, String apiURL) {
        Response applResponse = null;
        OAuth1AccessToken apiAccessToken;
        OAuth10aService serviceOBP = INGCONSTANT.getServices();
        try {
            if (UserAuthUtil.checkCacheAccToken(username) || username.isEmpty()) {

                OAuthRequest requestResource = new OAuthRequest(Verb.GET, apiURL);

                if (UserAuthUtil.checkCacheAccToken(username)) {
                    apiAccessToken = UserAuthUtil.readCacheAccToken(username);
                    serviceOBP.signRequest(apiAccessToken, requestResource);
                }

                Response apiResponse = serviceOBP.execute(requestResource);

                if (apiResponse.getCode() == 200) {
                    //applResponse = apiResponse;
                    applResponse = new Response(apiResponse.getCode(), apiResponse.getMessage() ,apiResponse.getHeaders(), apiResponse.getBody());
                    System.out.println("This is Response " + applResponse);
                    return applResponse.getBody();
                } else if (apiResponse.getCode() == 400 || apiResponse.getCode() == 401) {
                    //applResponse = new Response(401, apiResponse.getMessage(),apiResponse.getHeaders(),getLoginPage());
                    throw new WebApplicationException(buildServiceUnavailableResponse(apiResponse.getCode(), "Login from here", getLoginPage()));
                } else {
                    // create message response here with 999 code.
                    //applResponse = new Response(apiResponse.getCode(), apiResponse.getMessage() ,apiResponse.getHeaders(), apiResponse.getBody());
                    ///applResponse = new Response(444, apiResponse.getMessage() ,apiResponse.getHeaders(), apiResponse.getBody());
                    throw new WebApplicationException(buildServiceUnavailableResponse(apiResponse.getCode(), apiResponse.getBody(), ""));

                }

            } else {
                // redirect to login URL with code 401
                //final Map<String, String> headers = null;
                //applResponse = new Response(401, "You are not registered to use this App", headers, getLoginPage());
                throw new WebApplicationException(buildServiceUnavailableResponse(401, "You are not registered to use this App, login from here", getLoginPage()));

            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new WebApplicationException(buildServiceUnavailableResponse(401, "Login from here", getLoginPage()));


    }

    private javax.ws.rs.core.Response buildServiceUnavailableResponse(int code, String message, String loginURL)
    {
        return javax.ws.rs.core.Response.status(code)
                .entity(message+"\n->"+loginURL)
                .build();
    }


}
