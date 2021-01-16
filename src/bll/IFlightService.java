package bll;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;
    Flight getFlightByDepartureAirPot(String departureAirPot);
    Flight getFlightByDestinationAirPot(String destinationAirPot);
    void updateFlight(Flight flight);


}
