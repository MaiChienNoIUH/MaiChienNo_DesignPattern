package StatePattern;

public class DirectorState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Xử lý mọi công việc chung của công ty");
    }
}
