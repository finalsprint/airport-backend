package com.keyin.airport.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {
    @Autowired
    private AirlineRepository airlineRepository;

    public Airline getAirline(Long id) {
        return airlineRepository.findById(id).orElse(null);
    }

    public Airline createAirline(Airline airline) {
        return airlineRepository.save(airline);
    }
    public void deleteAirline(Long id) {
        airlineRepository.deleteById(id);
    }

    public List<Airline> getAllAirlines() {
        return (List<Airline>) airlineRepository.findAll();
    }
}
