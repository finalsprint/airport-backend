package com.keyin.airport.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }



    public List<Flight> getAllFlights() {
        return (List<Flight>) flightRepository.findAll();
    }
}
