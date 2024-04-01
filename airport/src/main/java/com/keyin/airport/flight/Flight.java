package com.keyin.airport.flight;

import com.keyin.airport.airline.Airline;
import com.keyin.airport.airport.Airport;
import com.keyin.airport.gate.Gate;
import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JoinColumn
    @ManyToOne //Many flights can be associated with one airline
    private Airline airline; //Airline associated with the flight

    @JoinColumn
    @ManyToOne //Many flights can be associated with one airport
    private Airport orginAirport; //Origin airport of the flight

    @JoinColumn
    @ManyToOne //Many flights can be associated with one airport
    private Airport destinationAirport; //Destination airport of the flight

    @Column
    private String flightNumber; //Flight number

    @Column
    private String departureTime; //Departure time of the flight

    @Column
    private String arrivalTime; //Arrival time of the flight

    @Column
    private String flightStatus; //Status of the flight

    @JoinColumn
    @ManyToOne //Many flights can be associated with one gate
    private Gate gate;
}
