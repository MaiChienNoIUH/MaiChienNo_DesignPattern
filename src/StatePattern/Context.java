package StatePattern;

public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        this.state.handleRequest();
    }
}
