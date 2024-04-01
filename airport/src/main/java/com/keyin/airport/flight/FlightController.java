package com.keyin.airport.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FlightController {
    @Autowired
    private FlightService flightService;

//    @GetMapping("/flights")
//    public List<Flight> getAllFlights() {
//        return flightService.getAllFlights();
//    }

    @GetMapping("/flights")
    public String getAllFlights() {
        return "flights";
    }

}
