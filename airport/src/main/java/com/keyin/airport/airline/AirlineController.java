package com.keyin.airport.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @GetMapping("/airlines")
    public String getAllAirlines() {
        return "airlines";
    }
//    @GetMapping("/airlines")
//    public List<Airline> getAllAirlines() {
//        return airlineService.getAllAirlines();
//    }


}
