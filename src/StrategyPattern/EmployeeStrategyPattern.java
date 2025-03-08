package StrategyPattern;

public class EmployeeStrategyPattern {
    private WorksStrategy workStrategy;

    public EmployeeStrategyPattern(WorksStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }

    public void setWorkStrategy(WorksStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }

    public void performWork() {
        workStrategy.handleRequest();
    }
}
