package com.keyin.airport.flight;

import com.keyin.airport.airline.AirlineRepository;
import com.keyin.airport.airport.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private AirportRepository airportRepository;

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight createFlight(Flight flight) {

        if (flight.getAirline() != null && flight.getAirline().getId() != 0) {
            flight.setAirline(airlineRepository.findById(flight.getAirline().getId()).orElse(null));
        }

        if (flight.getOriginAirport() != null && flight.getOriginAirport().getId() != 0) {
            flight.setOriginAirport(airportRepository.findById(flight.getOriginAirport().getId()).orElse(null));
        }

        if (flight.getDestinationAirport() != null && flight.getDestinationAirport().getId() != 0) {
            flight.setDestinationAirport(airportRepository.findById(flight.getDestinationAirport().getId()).orElse(null));
        }

        return flightRepository.save(flight);
    }




    public List<Flight> getAllFlights() {
        return (List<Flight>) flightRepository.findAll();
    }
}
