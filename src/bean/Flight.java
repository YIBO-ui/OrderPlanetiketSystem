package bean;

public class Flight {
    private String id;//没有业务意义
    private String departureAirPort;//出发城市
    private String destinationAirPort;//到达城市
    private String depattureTime;//出发日期
    private String planeType;//飞机型号
    private String currenSeatSeatNum;//航班总座位数

    void customerSet(Flight flight) {
    }

    public String getTotalSeatNum() {
        return currenSeatSeatNum;
    }

    public void setTotalSeatNum(String totalSeatNum) {
        this.currenSeatSeatNum = totalSeatNum;
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



}
