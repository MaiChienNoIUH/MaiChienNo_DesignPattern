package DecoratorPattern;

public class OfficeStaffDecorator extends EmployeeDecorator{
    public OfficeStaffDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performWork() {
        super.performWork();
        System.out.println("Làm việc với máy tính, xử lý hồ sơ, giao tiếp với khách hàng.");
    }
}
