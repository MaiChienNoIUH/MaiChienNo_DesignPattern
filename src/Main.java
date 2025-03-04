import NoPattern.EmployeeNoPattern;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeNoPattern employee1_noPattern = new EmployeeNoPattern("1", "Kế toán trưởng");
        EmployeeNoPattern employee2_noPattern = new EmployeeNoPattern("2", "Nhân viên văn phòng");
        EmployeeNoPattern employee3_noPattern = new EmployeeNoPattern("3",  "Nhân viên văn phòng");
        EmployeeNoPattern employee4_noPattern = new EmployeeNoPattern("4", "Đội trưởng");
        EmployeeNoPattern employee5_noPattern = new EmployeeNoPattern("5",  "Giám đốc");
        EmployeeNoPattern employee6_noPattern = new EmployeeNoPattern("6", "Nhân viên xưởng");
        EmployeeNoPattern employee7_noPattern = new EmployeeNoPattern("7",  "Nhân viên xưởng");
        EmployeeNoPattern employee8_noPattern = new EmployeeNoPattern("8", "Nhân viên xưởng");

        System.out.println(employee1_noPattern);
        employee1_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee2_noPattern);
        employee2_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee3_noPattern);
        employee3_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee4_noPattern);
        employee4_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee5_noPattern);
        employee5_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee6_noPattern);
        employee6_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee7_noPattern);
        employee7_noPattern.handleRequest();
        System.out.println("-------------------------------------------------");
        System.out.println(employee8_noPattern);
        employee8_noPattern.handleRequest();
    }
}