package com.keyin.airport.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;

//    @GetMapping("/airports")
//    public List<Airport> getAllAirports() {
//        return airportService.getAllAirports();
//    }

    @GetMapping("/airports")
    public String getAllAirports() {
        return "airports";
    }


}
