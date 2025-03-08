package StrategyPattern;

public class CaptainStrategy implements WorksStrategy{
    @Override
    public void handleRequest() {
        System.out.println("Kiểm kê tài sản, hàng hóa, đơn hàng của công ty");
    }
}
