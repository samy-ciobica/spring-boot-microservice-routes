package com.samy.microservice.api.impl;

import com.samy.microservice.config.ApplicationConfiguration;
import com.samy.microservice.config.Constants;
import com.samy.microservice.model.provider.RideResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final Logger LOGGER = LoggerFactory.getLogger(ApiServiceImpl.class);
    private final ApplicationConfiguration config;
    private final RestTemplate restTemplate;

    @Autowired
    public ApiServiceImpl(ApplicationConfiguration config, RestTemplate restTemplate) {
        this.config = config;
        this.restTemplate = restTemplate;
    }

    @Cacheable(Constants.ROUTES_CACHE)
    @Override
    public List<RideResult> getRides(String lowerLeftLatLon, String upperRightLatLon, String companyZoneIds) {
        LOGGER.info("RETRIEVING ROUTES FROM THE API");
        String url = this.config.getRidesApiUrl();

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("lowerLeftLatLon", lowerLeftLatLon);
        params.add("upperRightLatLon", upperRightLatLon);
        params.add("companyZoneIds", companyZoneIds);

        url = UriComponentsBuilder.fromUriString(url).queryParams(params).build().toString();

        try {
            ResponseEntity<List<RideResult>> result = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<RideResult>>() {
            });
            if (!result.getStatusCode().equals(HttpStatus.OK)) {
                return new ArrayList<>();
            }
            return result.getBody();
        } catch (Exception e) {
            LOGGER.error("Could not retrieve the RIDES from the API" + e.getMessage());
            return new ArrayList<>();
        }
    }

}
