package NoPattern;

public class EmployeeNoPattern {
    private String id;
    private String name;
    private String department;
    private double salary;
    private String chucVu;

    public EmployeeNoPattern(String id, String name, String department, double salary, String chucVu) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.chucVu = chucVu;
    }

    public EmployeeNoPattern(String id, String chucVu) {
        this.id = id;
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        if (chucVu.equals("Đội trưởng")) {
            System.out.println("Quản lý hàng và nhân viên xưởng");
        } else if(chucVu.equals("Giám đốc")) {
            System.out.println("Xử lý mọi công việc chung của công ty");
        } else if(chucVu.equals("Nhân viên văn phòng")) {
            System.out.println("Làm việc với máy tính, xử lý hồ sơ, giao tiếp với khách hàng");
        }else if(chucVu.equals("Nhân viên xưởng")) {
            System.out.println("Vận chuyển, xử lý đơn hàng");
        }else if(chucVu.equals("Kế toán trưởng")) {
            System.out.println("Kiểm kê tài sản, hàng hóa, đơn hàng của công ty");
        }
    }

    @Override
    public String toString() {
        return "EmployeeNoPattern{" +
                "id='" + id + '\'' +
                ", chucVu='" + chucVu + '\'' +
                '}';
    }
}
