package com.keyin.airport.dataStarter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public DataInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add airlines to the database.
        jdbcTemplate.execute("INSERT INTO airline (name, airline_code) VALUES ('Maple Airlines', 'MA')");
        jdbcTemplate.execute("INSERT INTO airline (name, airline_code) VALUES ('Canadian Airlines', 'CA')");
        jdbcTemplate.execute("INSERT INTO airline (name, airline_code) VALUES ('NL Airlines', 'NL')");


        // Add airports to the database.
        jdbcTemplate.execute("INSERT INTO airport (name, airport_code, location) VALUES ('Gander International Airport', 'YQX', 'Gander')");
        jdbcTemplate.execute("INSERT INTO airport (name, airport_code, location) VALUES ('Toronto Pearson International Airport', 'YYZ', 'Toronto')");
        jdbcTemplate.execute("INSERT INTO airport (name, airport_code, location) VALUES ('Montréal-Pierre Elliott Trudeau International', 'YUL', 'Montreal')");

        // Add gates to the database.
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('A1', 1)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('B2', 1)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('C3', 1)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('D4', 2)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('E5', 2)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('F6', 2)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('G7', 3)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('H8', 3)");
        jdbcTemplate.execute("INSERT INTO gate (gate_number, airport_id_id) VALUES ('I9', 3)");

        // Add 5 flights to each airport.
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 1, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA123', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 2, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA124', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 3, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA125', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 4, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA126', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 5, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA127', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 6, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA123', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 7, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA124', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 8, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA125', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 9, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA126', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 1, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA127', 'ON TIME')");
        // add flights for airline 3
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 2, 1, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL123', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 3, 1, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL124', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 4, 1, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL125', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 5, 1, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL126', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 6, 1, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL127', 'ON TIME')");
        // add flights for destination airport 3
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 3, 7, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA128', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 3, 8, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA128', 'ON TIME')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (3, 3, 9, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'NL128', 'ON TIME')");
        // add delayed and cancelled flights
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 1, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA129', 'DELAYED')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (1, 1, 2, 2, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'MA130', 'CANCELLED')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 3, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA129', 'DELAYED')");
        jdbcTemplate.execute("INSERT INTO flight (airline_id, destination_airport_id, gate_id, origin_airport_id, arrival_time, departure_time, flight_number, flight_status) VALUES (2, 2, 4, 3, '2021-12-01 12:00:00', '2021-12-01 10:00:00', 'CA130', 'CANCELLED')");





    }
}
