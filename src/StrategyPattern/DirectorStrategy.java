package StrategyPattern;

public class DirectorStrategy implements WorksStrategy{
    @Override
    public void handleRequest() {
        System.out.println("Xử lý mọi công việc chung của công ty");
    }
}
