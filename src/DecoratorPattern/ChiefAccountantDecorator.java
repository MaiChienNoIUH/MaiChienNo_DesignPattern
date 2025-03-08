package DecoratorPattern;

public class ChiefAccountantDecorator extends EmployeeDecorator{
    public ChiefAccountantDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void performWork() {
        super.performWork();
        System.out.println("Kiểm tra, duyệt các chứng từ kế toán.");
    }
}
