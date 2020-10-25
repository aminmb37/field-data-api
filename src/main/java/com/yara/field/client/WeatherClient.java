package com.yara.field.client;

import com.yara.field.dto.FieldDto;
import com.yara.field.dto.PolygonDto;

import java.util.List;

public interface WeatherClient {
    PolygonDto createPolygon(FieldDto fieldDto);

    List<Weather> weatherHistory(String polygonId, String startDay, String endDay);
}
