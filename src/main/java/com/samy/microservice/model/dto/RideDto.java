package com.samy.microservice.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RideDto {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("licencePlate")
    private String licencePlate;
    @JsonProperty("range")
    private Integer range;
    @JsonProperty("batteryLevel")
    private Integer batteryLevel;
    @JsonProperty("helmets")
    private Integer helmets;
    @JsonProperty("model")
    private String model;
    @JsonProperty("resourceImageId")
    private String resourceImageId;
    @JsonProperty("realTimeData")
    private Boolean realTimeData;
    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("companyZoneId")
    private Integer companyZoneId;

    public RideDto() {
    }

    public RideDto(String id, String name, Double x, Double y, String licencePlate, Integer range, Integer batteryLevel, Integer helmets, String model, String resourceImageId, Boolean realTimeData, String resourceType, Integer companyZoneId) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.licencePlate = licencePlate;
        this.range = range;
        this.batteryLevel = batteryLevel;
        this.helmets = helmets;
        this.model = model;
        this.resourceImageId = resourceImageId;
        this.realTimeData = realTimeData;
        this.resourceType = resourceType;
        this.companyZoneId = companyZoneId;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    @JsonProperty("licencePlate")
    public String getLicencePlate() {
        return licencePlate;
    }

    @JsonProperty("licencePlate")
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @JsonProperty("range")
    public Integer getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Integer range) {
        this.range = range;
    }

    @JsonProperty("batteryLevel")
    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    @JsonProperty("batteryLevel")
    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @JsonProperty("helmets")
    public Integer getHelmets() {
        return helmets;
    }

    @JsonProperty("helmets")
    public void setHelmets(Integer helmets) {
        this.helmets = helmets;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("resourceImageId")
    public String getResourceImageId() {
        return resourceImageId;
    }

    @JsonProperty("resourceImageId")
    public void setResourceImageId(String resourceImageId) {
        this.resourceImageId = resourceImageId;
    }

    @JsonProperty("realTimeData")
    public Boolean getRealTimeData() {
        return realTimeData;
    }

    @JsonProperty("realTimeData")
    public void setRealTimeData(Boolean realTimeData) {
        this.realTimeData = realTimeData;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("companyZoneId")
    public Integer getCompanyZoneId() {
        return companyZoneId;
    }

    @JsonProperty("companyZoneId")
    public void setCompanyZoneId(Integer companyZoneId) {
        this.companyZoneId = companyZoneId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("x", x).append("y", y).append("licencePlate", licencePlate).append("range", range).append("batteryLevel", batteryLevel).append("helmets", helmets).append("model", model).append("resourceImageId", resourceImageId).append("realTimeData", realTimeData).append("resourceType", resourceType).append("companyZoneId", companyZoneId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(helmets).append(licencePlate).append(resourceImageId).append(range).append(name).append(x).append(y).append(model).append(id).append(realTimeData).append(companyZoneId).append(batteryLevel).append(resourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RideDto) == false) {
            return false;
        }
        RideDto rhs = ((RideDto) other);
        return new EqualsBuilder().append(helmets, rhs.helmets).append(licencePlate, rhs.licencePlate).append(resourceImageId, rhs.resourceImageId).append(range, rhs.range).append(name, rhs.name).append(x, rhs.x).append(y, rhs.y).append(model, rhs.model).append(id, rhs.id).append(realTimeData, rhs.realTimeData).append(companyZoneId, rhs.companyZoneId).append(batteryLevel, rhs.batteryLevel).append(resourceType, rhs.resourceType).isEquals();
    }
    public static class Builder {
        private String id;
        private String name;
        private Double x;
        private Double y;
        private String licencePlate;
        private Integer range;
        private Integer batteryLevel;
        private Integer helmets;
        private String model;
        private String resourceImageId;
        private Boolean realTimeData;
        private String resourceType;
        private Integer companyZoneId;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setX(Double x) {
            this.x = x;
            return this;
        }

        public Builder setY(Double y) {
            this.y = y;
            return this;
        }

        public Builder setLicencePlate(String licencePlate) {
            this.licencePlate = licencePlate;
            return this;
        }

        public Builder setRange(Integer range) {
            this.range = range;
            return this;
        }

        public Builder setBatteryLevel(Integer batteryLevel) {
            this.batteryLevel = batteryLevel;
            return this;
        }

        public Builder setHelmets(Integer helmets) {
            this.helmets = helmets;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setResourceImageId(String resourceImageId) {
            this.resourceImageId = resourceImageId;
            return this;
        }

        public Builder setRealTimeData(Boolean realTimeData) {
            this.realTimeData = realTimeData;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setCompanyZoneId(Integer companyZoneId) {
            this.companyZoneId = companyZoneId;
            return this;
        }

        public RideDto build() {
            return new RideDto(id, name, x, y, licencePlate, range, batteryLevel, helmets, model, resourceImageId, realTimeData, resourceType, companyZoneId);
        }
    }
}