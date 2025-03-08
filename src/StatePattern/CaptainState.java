package StatePattern;

public class CaptainState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Kiểm kê tài sản, hàng hóa, đơn hàng của công ty");
    }
}
