package com.github.kevinbrandolff.AfterShip.Controller;

import com.github.kevinbrandolff.AfterShip.Service.AfterShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class AfterShipController {

    @Autowired
    private AfterShipService afterShipService;

    @GetMapping(value = "/latest/{coin}")
    public ResponseEntity<Double> getLatest( @PathVariable String coin ) throws Exception {
        return new ResponseEntity<>( afterShipService.getValueToday(coin), HttpStatus.OK );
    }

    @GetMapping(value = "/historical/{coin}/{date}")
    public ResponseEntity<Double> getHistorical( @PathVariable String coin, @PathVariable String date ) throws Exception {
        return new ResponseEntity<>( afterShipService.getValueOfDate(date, coin), HttpStatus.OK );
    }

}
