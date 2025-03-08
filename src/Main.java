import NoPattern.EmployeeNoPattern;
import StatePattern.*;
import StrategyPattern.*;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        printALlEmployee_NoDegnPattern();
//        System.out.println("-------------------------------------------------");
//        System.out.println("STATE PATTERN");
//        printALlEmployee_StatePattern();
        System.out.println("-------------------------------------------------");
        System.out.println("STRATEGY PATTERN");
        printALlEmployee_StrategyPattern();
    }

    public static void printALlEmployee_NoDegnPattern(){
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

    public static void printALlEmployee_StatePattern(){
        // Tạo một nhân viên với trạng thái "Đội trưởng"
        EmployeeStatePattern employee = new EmployeeStatePattern(new CaptainState());
        System.out.println("Trạng thái: Đội trưởng");
        employee.handleRequest();  // In ra công việc của Đội trưởng

        System.out.println("----------");

        // Thay đổi trạng thái của nhân viên thành "Giám đốc"
        employee.setState(new DirectorState());
        System.out.println("Trạng thái: Giám đốc");
        employee.handleRequest();  // In ra công việc của Giám đốc

        System.out.println("----------");

        // Thay đổi trạng thái của nhân viên thành "Nhân viên VP"
        employee.setState(new OfficeStaffState());
        System.out.println("Trạng thái: Nhân viên VP");
        employee.handleRequest();  // In ra công việc của Nhân viên VP

        System.out.println("----------");

        // Thay đổi trạng thái của nhân viên thành "Nhân viên Xưởng"
        employee.setState(new WorkshopStaffState());
        System.out.println("Trạng thái: Nhân viên Xưởng");
        employee.handleRequest();  // In ra công việc của Nhân viên Xưởng

        System.out.println("----------");

        // Thay đổi trạng thái của nhân viên thành "Kế toán Trưởng"
        employee.setState(new ChiefAccountantState());
        System.out.println("Trạng thái: Kế toán Trưởng");
        employee.handleRequest();  // In ra công việc của Kế toán Trưởng
    }

    public static void printALlEmployee_StrategyPattern(){
        EmployeeStrategyPattern employee = new EmployeeStrategyPattern(new CaptainStrategy());
        System.out.println("Trạng thái: Đội trưởng");
        employee.performWork();

        System.out.println("----------");

        employee.setWorkStrategy(new DirectorStrategy());
        System.out.println("Trạng thái: Giám đốc");
        employee.performWork();

        System.out.println("----------");

        employee.setWorkStrategy(new OfficeStaffStrategy());
        System.out.println("Trạng thái: Nhân viên văn phòng");
        employee.performWork();

        System.out.println("----------");

        employee.setWorkStrategy(new WokshopStaffStrategy());
        System.out.println("Trạng thái: Nhân viên Xưởng");
        employee.performWork();

        System.out.println("----------");

        employee.setWorkStrategy(new ChiefAccountantStrategy());
        System.out.println("Trạng thái: Kế toán Trưởng");
        employee.performWork();
    }
}