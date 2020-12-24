package com.samy.microservice.controller.impl;


import com.samy.microservice.model.dto.RideDto;
import com.samy.microservice.service.CarSharingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CarSharingControllerImpl //implements CarSharingController
{

    final private CarSharingService carSharingService;

    @Autowired
    public CarSharingControllerImpl(CarSharingService carSharingService) {
        this.carSharingService = carSharingService;
    }

    @GetMapping(value = "/rides")
    public ResponseEntity<List<RideDto>> get() {
        List<RideDto> list = this.carSharingService.getRides();
        return new ResponseEntity<>(this.carSharingService.getRides(), list == null || list.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

}