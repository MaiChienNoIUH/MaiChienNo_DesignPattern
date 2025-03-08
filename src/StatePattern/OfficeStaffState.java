package StatePattern;

public class OfficeStaffState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Làm việc với máy tính, xử lý hồ sơ, giao tiếp với khách hàng");
    }

}
