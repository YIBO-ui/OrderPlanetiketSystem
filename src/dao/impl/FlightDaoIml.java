package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import javax.print.DocFlavor;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao{

    //方法重写
    @Override
    public void insertFlight(Flight flight) throws SQLException {

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, flight.getId());
        pstmt.setString(2, flight.getFlightId());
        pstmt.setString(3, flight.getPlaneType());
        pstmt.setInt(4, flight.getCurrentSeatNum());
        pstmt.setString(5, flight.getDepartureAirPort());
        pstmt.setString(6, flight.getDestinationAirPort());
        pstmt.setString(7, flight.getDepartureTime());

        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {

        Set<Flight> allFlights=new HashSet<Flight>();//容器

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,"+
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentSeatNum = rs.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = rs.getString("DESTINATION_AIRPORT");
            String departureTime = rs.getString("DEPARTURE_TIME");

            Flight flight=new Flight(flightId,planeType,currentSeatNum,departureAirPort
            ,destinationAirPort,departureTime);
            allFlights.add(flight);
        }
        return allFlights;
    }


    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {
        String sql = "select FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT," +
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight WHERE DEPARTURE_TIME=?";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        Flight flight=null;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,departureTime);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentSeatNum = rs.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = rs.getString("DESTINATION_AIRPORT");
            String departureTimes = rs.getString("DEPARTURE_TIME");

            flight=new Flight(flightId,planeType,currentSeatNum,departureAirPort
                    ,destinationAirPort,departureTimes);
        }
        return flight;
    }

    @Override
    public Flight getFlightByDepartureAirPot(String departureAirPot) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPot(String destinationAirPot) {
        return null;
    }


    @Override
    public Flight getFlightByDepartureAirPort(String DepartureAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }

}
