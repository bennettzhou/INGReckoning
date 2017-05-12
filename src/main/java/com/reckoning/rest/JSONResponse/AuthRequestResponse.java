package com.reckoning.rest.JSONResponse;

public class AuthRequestResponse {

    String status = null;
    String loginURL = null;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoginURL() {
        return loginURL;
    }

    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }

    @Override
    public String toString() {
        return "AuthRequestResponse{" +
                "status='" + status + '\'' +
                ", loginURL='" + loginURL + '\'' +
                '}';
    }
}
