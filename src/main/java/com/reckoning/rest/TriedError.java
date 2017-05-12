package com.reckoning.rest;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.reckoning.rest.Auth.OBPApi;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TriedError {



    public static void main(String[] args) {

        final OAuth10aService service = new ServiceBuilder()
                .apiKey("hsgqiuhwst4aooxh3kes5b1nnufxo4tbmjx4osvw")
                .apiSecret("dmzfauabbsaovaexx2qbvurvjvidsy0akgjrrvax")
                .callback("oob")
                .build(OBPApi.instance());

        final OAuth1RequestToken requestToken;
        try {
            requestToken = service.getRequestToken();


            final Scanner in = new Scanner(System.in, "UTF-8");

            System.out.println("=== OAuth Workflow ===");
            System.out.println();

            // Obtain the Authorization URL
            System.out.println("Fetching the Authorization URL...");
            String authUrl = service.getAuthorizationUrl(requestToken);
            System.out.println("Got the Authorization URL!");
            System.out.println("Now go and authorize ScribeJava here:");
            System.out.println(authUrl);
            System.out.println("And paste the authorization auth_verifier here");
            System.out.print(">>");

            //setAccessToken("bennettzhou1", "Bennett0910!", authUrl);

            final String auth_verifier = in.nextLine();
            System.out.println();

            // Trade the Request Token and Verfier for the Access Token
            System.out.println("Trading the Request Token for an Access Token...");

            final OAuth1AccessToken accessToken = service.getAccessToken(requestToken, auth_verifier);

            System.out.println("Got the Access Token!");
            System.out.println("(if your curious it looks like this: " + accessToken
                    + ", 'rawResponse'='" + accessToken.getRawResponse() + "')");
            System.out.println();

            // Now let's go and ask for a protected resource!
            System.out.println("Now we're going to access a protected resource...");
            final OAuthRequest request = new OAuthRequest(Verb.GET, OBPApi.getApiEndpoint()+"/users/current");
            service.signRequest(accessToken, request);
            final com.github.scribejava.core.model.Response response = service.execute(request);
            System.out.println("Got it! Lets see what we found...");
            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getBody());

            System.out.println();
            System.out.println("Thats it man! Go and build something awesome with ScribeJava! :)");


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private static void setAccessToken(String clientID, String clientSecret, String url) throws Exception {

        String params = "client_id=" + clientID + "&client_secret=" + clientSecret + "&grant_type=client_credentials";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        BufferedReader in;
        // add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(params);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        if (responseCode >= 400)
            in = new BufferedReader(new InputStreamReader(con.getErrorStream()));
        else
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
    }
}
