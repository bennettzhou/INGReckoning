package com.reckoning.rest;

import com.reckoning.rest.Auth.APIAccessHandler;
import com.reckoning.rest.Auth.OBPApi;
import com.reckoning.rest.JSONResponse.ResponseBanks;
import com.reckoning.rest.MyAccounts.AllBanks;
import com.reckoning.rest.MyAccounts.Banks;
import com.google.gson.Gson;
import com.reckoning.rest.JSONResponse.AuthRequestResponse;
import com.reckoning.rest.JSONResponse.MessageResponse;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.HashMap;


@Path("/")
public class JSONServiceHandler {
    APIAccessHandler session = APIAccessHandler.getInstance();
    //final static String BaseUrl = "https://apisandbox.openbankproject.com/obp/v2.0.0";
    final static String BaseUrl = OBPApi.getApiEndpoint()+"/obp/v2.1.0";

    @GET
    @Path("/welcome")
    @Produces("application/json")
    public String sayHiJSON() {

        String hi = "Welcome to new Reckoning";
        return hi;

    }

    @GET
    @Path("/hello")
    @Produces("application/json")
    public MessageResponse sayHelloJSON() {

        MessageResponse hello = new MessageResponse();
        hello.setMessage("Hello, I am online!");

        return hello;

    }

    @GET
    @Path("/initiate")
    @Produces("application/json")
    public AuthRequestResponse goToLoginPage() {
        AuthRequestResponse loginPage = new AuthRequestResponse();

        loginPage.setLoginURL(session.getLoginPage());
        if (loginPage.getLoginURL().equals(null)) {
            loginPage.setStatus("Failure");
        } else {
            loginPage.setStatus("Success");
        }
        return loginPage;
    }

    @GET
    @Path("/callBack")
    @Produces("application/json")
    public MessageResponse welcomePage(
            @QueryParam("oauth_token") String auth_token,
            @QueryParam("oauth_verifier") String auth_verifier) {

        MessageResponse welcomeText = new MessageResponse();
        String status = session.fetchAccessToken(auth_token, auth_verifier);
        if (status.equals("success")) {
            welcomeText.setMessage("you have successfully logged on! but I don't have anything for you now :)");
        } else {
            welcomeText.setMessage("Something went wrong here!" + "method : welcomePage");
        }
        return welcomeText;
    }

    @GET
    @Path("/userInfo")
    @Produces("application/json")
    public MessageResponse getUserDetails(
            @QueryParam("user_name") String username) {

        MessageResponse testMessage = new MessageResponse();
        String message = session.getAPIResponse(username, BaseUrl + "/users/current");
        try {
            //testMessage.setMessage(message.getCode() + message.getBody() + message.getHeaders() + message.getMessage());
            testMessage.setMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testMessage;

    }

    @GET
    @Path("/getBanks")
    @Produces("application/json")
    public ResponseBanks getBanks() {
        ResponseBanks reply = new ResponseBanks();
        ArrayList<String> bankList = new ArrayList<String>();

        HashMap<String, String> map = new HashMap<String, String>();
        String message = session.getAPIResponse("", BaseUrl + "/banks");
        Gson gson = new Gson();
        AllBanks obj = null;
        try {
            obj = gson.fromJson(message, AllBanks.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Banks banks : obj.getBanks()) {
            bankList.add(banks.getId() + ":" + banks.getFull_name());
            map.put(banks.getId(), banks.getFull_name());
        }

        reply.setBanks(bankList);
        return reply;
    }
}
