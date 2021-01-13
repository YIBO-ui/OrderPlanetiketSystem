package bean;

public class Flight {
    private String id;//没有业务意义
    private String filghtId;//航班ID
    private String planeType;//飞机型号
    private String currenSeatNum;//航班总座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String depattureTime;//出发日期

    void customerSet(Flight flight) {
    }
    //构造方法
    public Flight(String id, String filghtId, String planeType, String currenSeatSeatNum, String departureAirPort, String destinationAirPort, String depattureTime) {
        this.id = id;
        this.filghtId = filghtId;
        this.planeType = planeType;
        this.currenSeatNum = currenSeatSeatNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.depattureTime = depattureTime;

    }
    //（要先继承）toString方法重写
    @Override
    public String toString() {
        return "Flight{" +
                ", filghtId='" + filghtId + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currenSeatSeatNum='" + currenSeatNum + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", depattureTime='" + depattureTime + '\'' +
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

}