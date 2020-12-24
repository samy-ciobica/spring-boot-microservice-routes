package com.samy.microservice.api.impl;

import com.samy.microservice.model.dto.RideDto;
import com.samy.microservice.model.provider.RideResult;

import java.util.List;

public interface ApiService {

    List<RideResult> getRides(String lowerLeftLatLon, String upperRightLatLon, String companyZoneIds);

}
