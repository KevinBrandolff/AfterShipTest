package com.github.kevinbrandolff.AfterShip.Service;

import com.github.kevinbrandolff.AfterShip.DTO.ExchangeResponseDTO;
import com.github.kevinbrandolff.AfterShip.OpenExchangeRatesAPI.OpenExchangeRatesAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class AfterShipService {

    @Autowired
    private OpenExchangeRatesAPI openExchangeRatesAPI;

    public Double getValueToday(String coin) throws Exception {
        ExchangeResponseDTO response = openExchangeRatesAPI.getLatest();

        Class<?> classObj = response.getRates().getClass();

        Method getCoin = classObj.getDeclaredMethod("get"+coin);

        return Double.valueOf( getCoin.invoke(response.getRates()).toString() );
    }

    public Double getValueOfDate(String date, String coin) throws Exception {
        ExchangeResponseDTO response = openExchangeRatesAPI.getHistorical(date);

        Class<?> classObj = response.getRates().getClass();

        Method getCoin = classObj.getDeclaredMethod("get"+coin);

        return Double.valueOf( getCoin.invoke(response.getRates()).toString() );
    }

}
