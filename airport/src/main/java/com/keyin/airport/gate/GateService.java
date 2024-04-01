package com.keyin.airport.gate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GateService {
    @Autowired
    private GateRepository gateRepository;

    public List<Gate> getAllGates() {
        return (List<Gate>) gateRepository.findAll();
    }
}
