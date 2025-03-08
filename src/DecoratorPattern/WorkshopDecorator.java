package DecoratorPattern;

public class WorkshopDecorator extends EmployeeDecorator{
    public WorkshopDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performWork() {
        super.performWork();
        System.out.println("Làm việc với máy móc, sửa chữa, bảo dưỡng");
    }
}
