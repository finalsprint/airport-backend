package com.keyin.airport.flight;

import com.keyin.airport.airline.AirlineRepository;
import com.keyin.airport.airport.AirportRepository;
import com.keyin.airport.flight.Flight;
import com.keyin.airport.flight.FlightRepository;
import com.keyin.airport.gate.GateRepository;
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

    @Autowired
    private GateRepository gateRepository;

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

    public Flight createFlight(Flight flight) {
        // Handle Airline
        if (flight.getAirline() != null && flight.getAirline().getId() != 0) {
            flight.setAirline(airlineRepository.findById(flight.getAirline().getId()).orElse(null));
        }

        // Handle Origin Airport
        if (flight.getOriginAirport() != null && flight.getOriginAirport().getId() != 0) {
            flight.setOriginAirport(airportRepository.findById(flight.getOriginAirport().getId()).orElse(null));
        }

        // Handle Destination Airport
        if (flight.getDestinationAirport() != null && flight.getDestinationAirport().getId() != 0) {
            flight.setDestinationAirport(airportRepository.findById(flight.getDestinationAirport().getId()).orElse(null));
        }

        // Handle Arrival Gate
        if (flight.getArrivalGate() != null && flight.getArrivalGate().getId() != 0) {
            flight.setArrivalGate(gateRepository.findById(flight.getArrivalGate().getId()).orElse(null));
        }

        // Handle Departure Gate
        if (flight.getDepartureGate() != null && flight.getDepartureGate().getId() != 0) {
            flight.setDepartureGate(gateRepository.findById(flight.getDepartureGate().getId()).orElse(null));
        }

        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        return (List<Flight>) flightRepository.findAll();
    }
}
