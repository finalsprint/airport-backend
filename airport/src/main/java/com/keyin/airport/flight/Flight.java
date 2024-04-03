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
    private Airport originAirport; //Origin airport of the flight

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

    //Constructor methods
    public Flight() {
    }

    public Flight(long id, Airline airline, Airport originAirport, Airport destinationAirport, String flightNumber, String departureTime, String arrivalTime, String flightStatus, Gate gate) {
        this.id = id;
        this.airline = airline;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightStatus = flightStatus;
        this.gate = gate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(Airport orginAirport) {
        this.originAirport = orginAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

}
