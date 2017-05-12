package com.reckoning.rest.Utils;

import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.oauth.OAuth10aService;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.concurrent.TimeUnit;


public class CacheUtils {

    private static CacheManager requestManager = CacheManagerBuilder.newCacheManagerBuilder()
            .withCache("RequestMap", CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, OAuthRequest.class, ResourcePoolsBuilder.heap(1000))
                    .withExpiry(Expirations.timeToLiveExpiration(Duration.of(1, TimeUnit.DAYS))).build())
            .build(true);

    private static CacheManager servicemanager = CacheManagerBuilder.newCacheManagerBuilder()
            .withCache("ServiceMap", CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, OAuth10aService.class, ResourcePoolsBuilder.heap(1000))
                    .withExpiry(Expirations.timeToLiveExpiration(Duration.of(1, TimeUnit.DAYS))).build())
            .build(true);

    public static void putRequestMap(String user, String url, OAuthRequest request) {
        String key = buildRequestKey(user, url);
        Cache<String, OAuthRequest> cache = requestManager.getCache("RequestMap", String.class, OAuthRequest.class);
        cache.put(key, request);
    }

    public static OAuthRequest getRequestMap(String user, String url) {
        String key = buildRequestKey(user, url);
        Cache<String, OAuthRequest> cache = requestManager.getCache("RequestMap", String.class, OAuthRequest.class);
        OAuthRequest request = cache.get(key);
        return request;
    }

    private static String buildRequestKey(String user, String url) {
        StringBuilder sb = new StringBuilder();
        sb.append(user).append('_').append(url);
        return sb.toString();
    }

    public static void putServiceMap(String key, OAuth10aService service) {
        Cache<String, OAuth10aService> cache = servicemanager.getCache("ServiceMap", String.class, OAuth10aService.class);
        cache.put(key, service);
    }

    public static OAuth10aService getServiceMap(String key) {
        Cache<String, OAuth10aService> cache = servicemanager.getCache("ServiceMap", String.class, OAuth10aService.class);
        OAuth10aService service = cache.get(key);
        return service;
    }


}
