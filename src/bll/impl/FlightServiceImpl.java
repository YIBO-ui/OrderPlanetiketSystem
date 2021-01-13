package bll.impl;

import bean.Flight;
import bll.IFlightService;
import dao.IFlightDao;
import dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

     public FlightServiceImpl(){ iFlightDao=new FlightDaoIml();}

    @Override
    public void insertFlight(Flight flight) throws SQLException{
         iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException{
        return iFlightDao.getAllFlights();
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
