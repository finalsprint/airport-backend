package com.keyin.airport.gate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GateController {
    @Autowired
    private GateService gateService;

    @GetMapping("/gates")
    public List<Gate> getAllGates() {
        return gateService.getAllGates();
    }

    @GetMapping("/gates/{id}")
    public Gate getGateById(@PathVariable Long id) {
        return gateService.getGateById(id);
    }

    @GetMapping("/gates/origin-airport/{airportId}")
    public List<Gate> getGatesByOriginAirport(@PathVariable Long airportId) {
        return gateService.getGatesByAirport(airportId);
    }

    @GetMapping("/gates/destination-airport/{airportId}")
    public List<Gate> getGatesByDestinationAirport(@PathVariable Long airportId) {
        return gateService.getGatesByAirport(airportId);
    }

    @PostMapping("/gates")
    public Gate createGate(@RequestBody Gate gate) {
        return gateService.createGate(gate);
    }

    @DeleteMapping("/gates/{id}")
    public void deleteGate(@PathVariable Long id) {
        gateService.deleteGate(id);
    }


}
