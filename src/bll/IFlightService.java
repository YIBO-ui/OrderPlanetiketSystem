package bll;

import bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureAirPot(String departureAirPot);
    Flight getFlightByDestinationAirPot(String destinationAirPot);
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    void updateFlight(Flight flight);
}
