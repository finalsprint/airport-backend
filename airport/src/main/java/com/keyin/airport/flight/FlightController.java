package com.keyin.airport.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/flights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/flights/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @GetMapping("/flights/origin/{originAirportId}")
    public List<Flight> getFlightByOrigin(@PathVariable("originAirportId") long originAirportId) {
        return flightService.getFlightByOrigin(originAirportId);
    }

    @GetMapping("/flights/destination/{destinationAirportId}")
    public List<Flight> getFlightByDestination(@PathVariable("destinationAirportId") long destinationAirportId) {
        return flightService.getFlightByDestination(destinationAirportId);
    }

    @PostMapping("/flights")
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @DeleteMapping("/flights/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }

}
