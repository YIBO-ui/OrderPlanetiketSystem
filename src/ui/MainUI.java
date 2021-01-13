package ui;
import bean.Flight;
import bll.IFlightService;
import bll.impl.FlightServiceImpl;
import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1，进行航班信息录入");
            System.out.println("按2，显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");

            int choice = sc.nextInt();

            if (choice == 1) {
                String id = UUID.randomUUID().toString().replace("-","");
                System.out.println("请输入航班编号：");
                String flightId = sc.next();
                System.out.println("请输入机型：");
                String planeType = sc.next();
                System.out.println("请输入座位数：");
                int currenSeatSeatNum = sc.nextInt();
                System.out.println("请输入起飞机场：");
                String departureAirPort = sc.next();
                System.out.println("请输入目的机场：");
                String destinationAirPort = sc.next();
                System.out.println("请输入起飞时间：");
                String depattureTime = sc.next();

                Flight flight = new Flight(id, flightId, planeType, currenSeatSeatNum,
                        departureAirPort, destinationAirPort, depattureTime);
                IFlightService iFlightService = new FlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }
            }else if (choice==2){
                IFlightService iFlightService=new FlightServiceImpl();
                try {
                    Set<Flight> allFlight=iFlightService.getAllFlights();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
