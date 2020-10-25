package com.yara.field.client;

public class Weather {
    private String timestamp;
    private Double temperature;
    private Integer humidity;
    private Double temperatureMax;
    private Double temperatureMin;

    public Weather() {
    }

    public Weather(String timestamp, Double temperature, Integer humidity, Double temperatureMax, Double temperatureMin) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "timestamp='" + timestamp + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", temperatureMax=" + temperatureMax +
                ", temperatureMin=" + temperatureMin +
                '}';
    }
}
