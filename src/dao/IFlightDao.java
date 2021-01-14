package dao;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;
    Flight getFlightByDepartureAirPot(String departureAirPot);
    Flight getFlightByDestinationAirPot(String destinationAirPot);
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    void updateFlight(Flight flight);//座位信息更新+
}
