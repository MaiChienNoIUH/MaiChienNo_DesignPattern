package StatePattern;

public class WorkshopStaffState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Vận chuyển, xử lý đơn hàng");
    }
}
