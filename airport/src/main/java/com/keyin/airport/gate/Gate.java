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
}
