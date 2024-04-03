package com.keyin.airport.gate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    @PostMapping("/gates")
    public Gate createGate(@RequestBody Gate gate) {
        return gateService.createGate(gate);
    }

    @DeleteMapping("/gates/{id}")
    public void deleteGate(@PathVariable Long id) {
        gateService.deleteGate(id);
    }


}
