package com.samy.microservice.service;

import com.samy.microservice.model.dto.RideDto;

import java.util.List;

public interface CarSharingService {

    List<RideDto> getRides();

}
