package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {
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
        pstmt.setString(2, flight.getFilghtId());
        pstmt.setString(3, flight.getPlaneType());
        pstmt.setInt(4, flight.getCurrenSeatNum());
        pstmt.setString(5, flight.getDepartureAirPort());
        pstmt.setString(6, flight.getDestinationAirPort());
        pstmt.setString(7, flight.getDepattureTime());

        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> allFlights=new HashSet<Flight>();//容器

        String url = "jdbc:oracle:thin:@locahost:1521:orcl";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM flight";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            String id = rs.getString("ID");
            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currenSeatNum = rs.getInt("CURREN_SEAT_NUM");
            String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = rs.getString("DESTNATION_AIRPORT");
            String depattureTime = rs.getString("DEPATTURE_TIME");

            Flight flight=new Flight(id,flightId,planeType,currenSeatNum,departureAirPort
            ,destinationAirPort,depattureTime);
            allFlights.add(flight);
        }
        return allFlights;
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
