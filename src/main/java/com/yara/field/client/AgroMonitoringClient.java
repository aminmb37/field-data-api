package com.yara.field.client;

import com.yara.field.dto.FieldDto;
import com.yara.field.dto.PolygonDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class AgroMonitoringClient implements WeatherClient {
    private final static String PERSONAL_API_KEY = "7211e78911af030e76b4824fa88bda70";

    private final RestTemplate restTemplate;

    public AgroMonitoringClient() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    @Override
    public PolygonDto createPolygon(FieldDto fieldDto) {
        String url = "http://api.agromonitoring.com/agro/1.0/polygons";

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("appid", PERSONAL_API_KEY);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<FieldDto> requestEntity = new HttpEntity<>(fieldDto, headers);

        ResponseEntity<PolygonDto> responseEntity = restTemplate
                .postForEntity(uriBuilder.toUriString(), requestEntity, PolygonDto.class);

        if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
            return responseEntity.getBody();
        } else {
            throw new RuntimeException("Agro Monitoring Create Polygon Service Error!" + responseEntity.toString());
        }
    }

    @Override
    public List<Weather> weatherHistory(String polygonId, String startDay, String endDay) {
        String url = "http://api.agromonitoring.com/agro/1.0/weather/history";

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("appid", PERSONAL_API_KEY)
                .queryParam("polyid", polygonId)
                .queryParam("start", startDay)
                .queryParam("end", endDay);

        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(uriBuilder.toUriString(), String.class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return getWeatherList(responseEntity.getBody());
        } else {
            throw new RuntimeException(
                    "Agro Monitoring Historical Weather Data Service Error!" + responseEntity.toString());
        }
    }

    //Todo Parse the weather data and create a list of Weather
    private List<Weather> getWeatherList(String data) {
        return new ArrayList<>();
    }
}
