package com.keyin.airport.airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {
    @Autowired
    private AirlineRepository airlineRepository;

    public List<Airline> getAllAirlines() {
        return (List<Airline>) airlineRepository.findAll();
    }
}
