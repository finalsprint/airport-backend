package com.keyin.airport.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/airports/{id}")
    public Airport getAirportById(@PathVariable Long id) {
        return airportService.getAirportById(id);
    }

    @PostMapping("/airports")
    public Airport createAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }

    @DeleteMapping("/airports/{id}")
    public void deleteAirport(@PathVariable Long id) {
        airportService.deleteAirport(id);
    }






}
