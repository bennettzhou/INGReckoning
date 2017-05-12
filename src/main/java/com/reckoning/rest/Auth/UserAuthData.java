package com.reckoning.rest.Auth;

import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;

import java.io.Serializable;

public class UserAuthData implements Serializable{
    String username;
    OAuth1RequestToken oauth_req_Token;
    OAuth1AccessToken oauth_acc_Secret;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public OAuth1RequestToken getOauth_req_Token() { return oauth_req_Token; }

    public void setOauth_req_Token(OAuth1RequestToken oauth_req_Token) {
        this.oauth_req_Token = oauth_req_Token;
    }

    public OAuth1AccessToken getOauth_acc_Secret() {
        return oauth_acc_Secret;
    }

    public void setOauth_acc_Secret(OAuth1AccessToken oauth_acc_Secret) {
        this.oauth_acc_Secret = oauth_acc_Secret;
    }

}
