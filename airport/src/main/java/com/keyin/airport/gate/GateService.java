package com.keyin.airport.gate;

import com.keyin.airport.airport.Airport;
import com.keyin.airport.airport.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GateService {
    @Autowired
    private GateRepository gateRepository;

    @Autowired
    private AirportRepository airportRepository; // Assuming you have an AirportRepository

    public List<Gate> getAllGates() {
        return (List<Gate>) gateRepository.findAll();
    }

    public Gate createGate(Gate gate) {
        if (gate.getAirportId() != null && gate.getAirportId().getId() != 0) {
            Airport airport = airportRepository.findById(gate.getAirportId().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Airport not found with ID: " + gate.getAirportId().getId()));
            gate.setAirportId(airport);
        } else {
            throw new IllegalArgumentException("Airport ID must be provided");
        }
        return gateRepository.save(gate);
    }

    public List<Gate> getGatesByAirport(Long airportId) {
        return gateRepository.findByAirportId_Id(airportId);
    }

    public void deleteGate(Long id) {
        gateRepository.deleteById(id);
    }

    public Gate getGateById(Long id) {
        return gateRepository.findById(id).orElse(null);
    }
}
