package com.keyin.airport.flight;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {
    List<Flight> findByOriginAirport_Id(Long id);
}
