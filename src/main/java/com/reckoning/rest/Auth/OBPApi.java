package com.reckoning.rest.Auth;

import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;

public class OBPApi extends DefaultApi10a {
        private static final String API_ENDPOINT = "http://bank-api-23.24hcoding.pl";
        private static final String REQUEST_TOKEN_RESOURCE = "/oauth/initiate";
        private static final String AUTHORIZE_URL = "/oauth/authorize?oauth_token=%s";
        private static final String ACCESS_TOKEN_RESOURCE = "/oauth/token";

        @Override
        public String getAccessTokenEndpoint() {
            return API_ENDPOINT + ACCESS_TOKEN_RESOURCE;
        }

        @Override
        public String getRequestTokenEndpoint() {
            return API_ENDPOINT + REQUEST_TOKEN_RESOURCE;
        }

        @Override
        public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
            return String.format(API_ENDPOINT + AUTHORIZE_URL, requestToken.getToken());
        }

        private static class InstanceHolder {
            private static final OBPApi INSTANCE = new OBPApi();
        }

        public static OBPApi instance() {
            return InstanceHolder.INSTANCE;
        }

    public static String getApiEndpoint() {
        return API_ENDPOINT;
    }
}
