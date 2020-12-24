package com.samy.microservice.converter;

import com.samy.microservice.model.dto.RideDto;
import com.samy.microservice.model.provider.RideResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarSharingConverter {

    public List<RideDto> toRideDtoList(List<RideResult> list) {
        if (list == null && !list.isEmpty()) return new ArrayList<>();
        return list.stream().map(this::toRideDto).collect(Collectors.toList());
    }

    private RideDto toRideDto(RideResult rideResult) {
        return new RideDto.Builder().setId(rideResult.getId()).setName(rideResult.getName()).setX(rideResult.getX())
                .setY(rideResult.getY()).setLicencePlate(rideResult.getLicencePlate()).setRange(rideResult.getRange())
                .setBatteryLevel(rideResult.getBatteryLevel()).setHelmets(rideResult.getHelmets()).setModel(rideResult.getModel())
                .setResourceImageId(rideResult.getResourceImageId()).setRealTimeData(rideResult.getRealTimeData())
                .setResourceType(rideResult.getResourceType()).setCompanyZoneId(rideResult.getCompanyZoneId()).build();
    }

}
