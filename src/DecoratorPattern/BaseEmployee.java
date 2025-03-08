package DecoratorPattern;

public class BaseEmployee implements Employee{
    @Override
    public void performWork() {
        System.out.println("Nhân viên cơ bản làm việc.");
    }
}
