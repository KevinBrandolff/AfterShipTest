package com.github.kevinbrandolff.AfterShip.DTO;

import java.math.BigDecimal;

public class ExchangeResponseDTO {

    private String disclaimer;
    private String license;
    private BigDecimal timestamp;
    private String base;
    private RatesDTO rates;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public RatesDTO getRates() {
        return rates;
    }

    public void setRates(RatesDTO rates) {
        this.rates = rates;
    }
}
