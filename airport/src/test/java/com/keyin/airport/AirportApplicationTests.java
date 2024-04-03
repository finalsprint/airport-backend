package com.keyin.airport;

import com.keyin.airport.airline.Airline;
import com.keyin.airport.airport.Airport;
import com.keyin.airport.flight.Flight;
import com.keyin.airport.gate.Gate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AirportApplicationTests {

	Airline airline1 = new Airline(1,"WestJet", "WSJ");
	Airport airport1 = new Airport(1,"St. John's INTL", "YYT", "St. John's, NL");
	Airport airport2 = new Airport(2,"Gander INTL", "YQX", "Gander, NL" );	Gate gate1 = new Gate(1, "1A" ,airport1);
	Gate gate2 = new Gate(2, "1B", airport2);

	@Test
	public void testAirline() {
		Assertions.assertEquals(1, airline1.getId());
        Assertions.assertEquals("WSJ", airline1.getAirlineCode());
	}

	@Test
	public void testAirport() {

		Assertions.assertEquals(1,airport1.getId());
		Assertions.assertEquals("YYT", airport1.getAirportCode());
	}

	@Test
	public void testFlight() {
		Flight flight1 = new Flight(33, airline1, airport1, airport2, "WS321", "1030", "1345","On Time",gate1, gate2);
		Assertions.assertEquals(33, flight1.getId());
		Assertions.assertEquals("YQX", flight1.getDestinationAirport().getAirportCode());
	}



}
