package com.reckoning.rest.Auth;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("provider_id")
    @Expose
    private String providerId;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("entitlements")
    @Expose
    private Entitlements entitlements;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Entitlements getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(Entitlements entitlements) {
        this.entitlements = entitlements;
    }

}

class Entitlements {

    @SerializedName("list")
    @Expose
    private List<Object> list = null;

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

}
