# Spring Boot Microservice API

## Description

The microservice calls one endpoint("https://apidev.meep.me/tripplan/api/v1/routers/lisboa/resources?
lowerLeftLatLon=38.711046,-9.160096&upperRightLatLon=38.739429,-
9.137115&companyZoneIds=545,467,473") every 30 seconds.
The data received is also cached for 30 seconds.

## Optimization
The rest method that calls the client endpoint gets called every 30 seconds.
The RideService that calls the api service caches the result every 30 seconds.

## Usage
The project is using SWAGGER-UI that exposes an dashboard where we can easily test our endpoints.
Once the application is  running you can access it at 
[http://localhost:8080/swagger-ui/index.html#](http://localhost:8080/swagger-ui/index.html#)

Or test it directly [http://localhost:8080/rides](http://localhost:8080/rides)

