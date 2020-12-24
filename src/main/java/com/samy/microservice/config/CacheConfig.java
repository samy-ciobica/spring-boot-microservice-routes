package com.samy.microservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CacheConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheConfig.class);
    private final CacheManager cacheManager;

    @Autowired
    public CacheConfig(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Scheduled(fixedDelay = 30000)
    @CacheEvict(value = Constants.ROUTES_CACHE)
    public void clearRoutesCache() {
        LOGGER.info("Clearing the Routes cache");
        cacheManager.getCache(Constants.ROUTES_CACHE).clear();
    }


}
