package bean;

public class Flight {
    private String id;//没有业务意义
    private String filghtId;//航班ID
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String depattureTime;//出发日期
    private String planeType;//飞机型号
    private String currenSeatNum;//航班座位数

    void customerSet(Flight flight) {
    }
    //构造方法
    public Flight(String id, String filghtId, String departureAirPort, String destinationAirPort, String depattureTime, String planeType, String currenSeatSeatNum) {
        this.id = id;
        this.filghtId = filghtId;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.depattureTime = depattureTime;
        this.planeType = planeType;
        this.currenSeatNum = currenSeatSeatNum;
    }
    //（要先继承）toString方法重写
    @Override
    public String toString() {
        return "Flight{" +
                ", filghtId='" + filghtId + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", depattureTime='" + depattureTime + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currenSeatSeatNum='" + currenSeatNum + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilghtId() {
        return filghtId;
    }

    public void setFilghtId(String filghtId) {
        this.filghtId = filghtId;
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

    public String getCurrenSeatSeatNum() {
        return currenSeatNum;
    }

    public void setCurrenSeatSeatNum(String currenSeatSeatNum) {
        this.currenSeatNum = currenSeatSeatNum;
    }
}
