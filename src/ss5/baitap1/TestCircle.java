package ss5.baitap1;
public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle1 = new Circle(); // Sử dụng hàm tạo không tham số
        Circle circle2 = new Circle(3.5); // Sử dụng hàm tạo có tham số

        // Gọi phương thức printDetails() để in thông tin
        System.out.println("Circle 1:");
        circle1.printDetails();

        System.out.println("Circle 2:");
        circle2.printDetails();
    }
}
