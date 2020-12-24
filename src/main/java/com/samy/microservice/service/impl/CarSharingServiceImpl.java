package com.samy.microservice.service.impl;

import com.samy.microservice.api.impl.ApiService;
import com.samy.microservice.config.ApplicationConfiguration;
import com.samy.microservice.converter.CarSharingConverter;
import com.samy.microservice.model.dto.RideDto;
import com.samy.microservice.model.provider.RideResult;
import com.samy.microservice.service.CarSharingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.samy.microservice.config.Constants.ROUTES_CACHE;

@Service
public class CarSharingServiceImpl implements CarSharingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarSharingServiceImpl.class);
    private final ApiService apiService;
    private final ApplicationConfiguration config;
    private final CarSharingConverter carSharingConverter;

    @Autowired
    public CarSharingServiceImpl(ApiService apiService, ApplicationConfiguration config, CarSharingConverter carSharingConverter) {
        this.apiService = apiService;
        this.config = config;
        this.carSharingConverter = carSharingConverter;
    }

    @Override
    @Scheduled(fixedRate = 30000)
    public List<RideDto> getRides() {
        LOGGER.info("CAR SHARING SERVICE - RETRIEVING RIDES");
        List<RideResult> apiResultList = this.apiService.getRides(this.config.getLowerLeftLatLon(), this.config.getUpperRightLatLon(), this.config.getCompanyZoneIds());
        return this.carSharingConverter.toRideDtoList(apiResultList);
    }
}
