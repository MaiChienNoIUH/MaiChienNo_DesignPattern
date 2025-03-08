package DecoratorPattern;

public class DirectorDecorator extends EmployeeDecorator{
    public DirectorDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performWork() {
        super.performWork();
        System.out.println("Ra quyết định chiến lược và xử lý mọi công việc chung.");
    }
}
