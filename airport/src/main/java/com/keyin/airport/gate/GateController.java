package com.keyin.airport.gate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GateController {
    @Autowired
    private GateService gateService;

//    @GetMapping("/gates")
//    public List<Gate> getAllGates() {
//        return gateService.getAllGates();
//    }

    @GetMapping("/gates")
    public String getAllGates() {
        return "gates";
    }
}
