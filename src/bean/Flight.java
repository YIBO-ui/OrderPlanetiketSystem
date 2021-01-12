package bean;

import java.util.Set;

public class Flight {
    private String id;//没有业务意义
    private String departureAirPort;//出发城市
    private String destinationAirPort;//到达城市
    private String depattureTime;//出发日期
    private String planeType;//飞机型号
    private String seatNo;//座位号
    private String totalSeatNum;//航班总座位数

    Set<Customer> customerSet(Flight flight) {
        return null;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getTotalSeatNum() {
        return totalSeatNum;
    }

    public void setTotalSeatNum(String totalSeatNum) {
        this.totalSeatNum = totalSeatNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartureAirPot() {
        return departureAirPort;
    }

    public void setDepartureAirPot(String departureAirPot) {
        this.departureAirPort = departureAirPot;
    }

    public String getDestinationAirPot() {
        return destinationAirPort;
    }

    public void setDestinationAirPot(String destinationAirPot) {
        this.destinationAirPort = destinationAirPot;
    }

    public String getDepattureTime() {
        return depattureTime;
    }

    public void setDepattureTime(String depattureTime) {
        this.depattureTime = depattureTime;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getSeatNumber() {
        return seatNo;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNo = seatNumber;
    }


}
