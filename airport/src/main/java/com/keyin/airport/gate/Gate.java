package com.keyin.airport.gate;

import com.keyin.airport.airport.Airport;
import jakarta.persistence.*;

@Entity
public class Gate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String gateNumber;

    // May need to change relationship to OneToMany
    @JoinColumn
    @ManyToOne
    private Airport airportId;

    public Gate() {
    }

    public Gate(long id, String gateNumber, Airport airportId) {
        this.id = id;
        this.gateNumber = gateNumber;
        this.airportId = airportId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Airport getAirportId() {
        return airportId;
    }

    public void setAirportId(Airport airportId) {
        this.airportId = airportId;
    }
}
