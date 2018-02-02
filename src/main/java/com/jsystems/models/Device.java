package com.jsystems.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Device {
    public String type;
    @JsonProperty("device.model")
    public List<DeviceModel> deviceModel;

    @Override
    public String toString() {
        return "Device{" +
                "type='" + type + '\'' +
                ", deviceModel=" + deviceModel +
                '}';
    }
}
