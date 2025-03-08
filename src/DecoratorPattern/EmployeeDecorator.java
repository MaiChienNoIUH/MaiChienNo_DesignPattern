package DecoratorPattern;

public abstract class EmployeeDecorator implements Employee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void performWork() {
        employee.performWork();
    }
}
