package dao;

import bean.Flight;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureAirPot(String departureAirPot);
    Flight getFlightByDestinationAirPot(String destinationAirPot);
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    void updateFlight(Flight flight);
}
