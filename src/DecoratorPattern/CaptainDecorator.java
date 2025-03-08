package DecoratorPattern;

public class CaptainDecorator extends EmployeeDecorator{
    public CaptainDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performWork() {
        super.performWork();
        System.out.println("Đi tuần kiểm kê tài sản, hàng hóa, đơn hàng.");
    }
}
