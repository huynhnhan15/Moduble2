package ss5.bai_tap_2;
public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student = new Student();

        // Gọi phương thức updateInfo
        student.updateInfo("Bob", "C04");

        // In thông tin
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Class: " + student.getClasses());
    }
}
