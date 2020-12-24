package com.samy.microservice.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
public class ApplicationConfiguration
{

    @Value("${app.service.ridesApiUrl}")
    private String ridesApiUrl;
    @Value("${app.service.lowerLeftLatLon}")
    String lowerLeftLatLon;
    @Value("${app.service.upperRightLatLon}")
    String upperRightLatLon;
    @Value("${app.service.companyZoneIds}")
    String companyZoneIds;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    public ApplicationConfiguration() {
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        return mapper;
    }

    public String getRidesApiUrl() {
        return ridesApiUrl;
    }

    public void setRidesApiUrl(String ridesApiUrl) {
        this.ridesApiUrl = ridesApiUrl;
    }

    public String getLowerLeftLatLon() {
        return lowerLeftLatLon;
    }

    public void setLowerLeftLatLon(String lowerLeftLatLon) {
        this.lowerLeftLatLon = lowerLeftLatLon;
    }

    public String getUpperRightLatLon() {
        return upperRightLatLon;
    }

    public void setUpperRightLatLon(String upperRightLatLon) {
        this.upperRightLatLon = upperRightLatLon;
    }

    public String getCompanyZoneIds() {
        return companyZoneIds;
    }

    public void setCompanyZoneIds(String companyZoneIds) {
        this.companyZoneIds = companyZoneIds;
    }
}