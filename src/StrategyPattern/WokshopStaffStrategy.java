package StrategyPattern;

public class WokshopStaffStrategy implements WorksStrategy{
    @Override
    public void handleRequest() {
        System.out.println("Làm việc với máy móc, sửa chữa, bảo dưỡng");
    }
}
