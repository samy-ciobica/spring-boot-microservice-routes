package com.samy.microservice.controller;

import com.samy.microservice.model.dto.RideDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CarSharingController {

    @GetMapping(value = "/rides")
    default ResponseEntity<List<RideDto>> get() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


}
