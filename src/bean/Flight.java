package bean;

public class Flight {
    private String id;//没有业务意义
    private String flightId;//航班ID
    private String planeType;//飞机型号
    private int currentSeatNum;//航班总座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departureTime;//出发日期

    public Flight(String flightId, String planeType,
                  int currentSeatNum, String departureAirPort,
                  String destinationAirPort, String departureTime) {
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatNum = currentSeatNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    void customerSet(Flight flight) {
    }
    //构造方法

    public Flight(String id, String flightId, String planeType,
                  int currentSeatNum, String departureAirPort,
                  String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatNum = currentSeatNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    //（要先继承）toString方法重写
    @Override
    public String toString() {
        return "Flight{" +
                ", 航班Id='" + flightId + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 座位数='" + currentSeatNum + '\'' +
                ", 出发城市='" + departureAirPort + '\'' +
                ", 目的城市='" + destinationAirPort + '\'' +
                ", 出发时间='" + departureTime + '\'' +
                '}'+"\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() { return planeType; }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatNum() {
        return currentSeatNum;
    }

    public void setCurrentSeatNum(int currentSeatNum) {
        this.currentSeatNum = currentSeatNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

}