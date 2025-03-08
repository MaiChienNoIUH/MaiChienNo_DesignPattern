package StatePattern;

public class EmployeeStatePattern {
    private String id;
    private String name;
    private String department;
    private double salary;
    private String chucVu;

    public EmployeeStatePattern(String id, String name, String department, double salary, String chucVu) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.chucVu = chucVu;
    }

    public EmployeeStatePattern(String id, String chucVu) {
        this.id = id;
        this.chucVu = chucVu;
    }

    private State state;  // Chuyển kiểu thành State

    public EmployeeStatePattern(State state) {
        this.state = state;
    }

    public void setState(State state) {  // Nhận đối tượng kiểu State
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest();  // Gọi handleRequest của state
    }

    @Override
    public String toString() {
        return "EmployeeStatePattern{" +
                "id='" + id + '\'' +
                ", chucVu='" + chucVu + '\'' +
                '}';
    }
}
