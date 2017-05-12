package com.reckoning.rest.Auth;

import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class UserAuthUtil {

    static CacheManager cm = CacheManager.getInstance();
    //static Cache cache_acc_token = cm.getCache("acc_token");

    public static void addStartupCache(String cachename){
        cm.addCache(cachename);
        System.out.println("Added : " + cm.getCache(cachename));
    }

    public static void writeCacheReqToken(OAuth1RequestToken reqToken){
        cm.getCache("req_token").put(new Element(reqToken.getToken(), reqToken));
    }

    public static boolean checkCacheReqKey(String reqKey){
        return cm.getCache("req_token").isKeyInCache(reqKey);
    }

    public static OAuth1RequestToken readCacheReqToken(String reqKey){
        return (OAuth1RequestToken) cm.getCache("req_token").get(reqKey).getObjectValue();
    }

    public static void writeCacheAccToken(String username, OAuth1RequestToken reqToken, OAuth1AccessToken accToken){
        if(checkCacheAccToken(username)){
            System.out.println("Updating existing access token in cache...");
            boolean removeStatus = cm.getCache("acc_token").remove(username);
        } else {
           System.out.println("Adding new access token to cache...");
        }
        UserAuthData userDataCache = new UserAuthData();
        userDataCache.setUsername(username);
        userDataCache.setOauth_req_Token(reqToken);
        userDataCache.setOauth_acc_Secret(accToken);
        cm.getCache("acc_token").put(new Element(username, userDataCache));
        //if(cache_req_token.isKeyInCache())
    }

    public static boolean checkCacheAccToken(String username){
        return cm.getCache("acc_token").isKeyInCache(username);
    }

    public static OAuth1AccessToken readCacheAccToken(String username){
        UserAuthData userDataCache = new UserAuthData();
        if(checkCacheAccToken(username)){
            userDataCache = (UserAuthData) cm.getCache("acc_token").get(username).getObjectValue();
            return userDataCache.getOauth_acc_Secret();
        } else{
            return null;
        }
    }

    public static void flushOutCache(){
        cm.shutdown();
    }

    public static void printCachebyName(String cachename){

        System.out.println(cm.getCache(cachename).getKeys());
        System.out.println(cm.getCache(cachename).getStoreMBean());

    }

}
