package bll.impl;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class IFlightServiceImpl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1，进行航班信息录入");
            System.out.println("按2，显示航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");

            int choice=sc.nextInt();

            if (choice==1){
                System.out.println("请输入机型");
                String planeType=sc.next();
            }
        }
    }
}
