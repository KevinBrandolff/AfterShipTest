package com.github.kevinbrandolff.AfterShip.OpenExchangeRatesAPI;

import com.github.kevinbrandolff.AfterShip.DTO.ExchangeResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenExchangeRatesAPI {

    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "https://openexchangerates.org/api/";

    private static final String ID_API = "?app_id=a58a0bde08524068bf168c9ccd971449";

    private static final String LATEST = "latest.json";
    private static final String HISTORICAL = "historical/";

    public ExchangeResponseDTO getLatest() {
        return restTemplate.getForObject(URL + LATEST + ID_API, ExchangeResponseDTO.class);
    }

    public ExchangeResponseDTO getHistorical(String date) {
        return restTemplate.getForObject(URL + HISTORICAL + date + ".json" + ID_API, ExchangeResponseDTO.class);
    }
}
