package dao.impl;

import bean.Flight;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {
//方法重写
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@locahost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO filght VALUES(?,?,?,?,?,?,?,);";

        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(1,flight.getFilghtId());
        pstmt.setString(1,flight.getPlaneType());
        pstmt.setString(1,flight.getCurrenSeatSeatNum());
        pstmt.setString(1,flight.getDepartureAirPort());
        pstmt.setString(1,flight.getDestinationAirPort());
        pstmt.setString(1,flight.getDepattureTime());
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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
