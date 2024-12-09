package ss5.baitap1;
public class Circle {
    // Thuộc tính private
    private double radius = 1.0;
    private String color = "red";

    // Hàm tạo không tham số
    public Circle() {
    }

    // Hàm tạo có tham số radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức private: getRadius
    private double getRadius() {
        return radius;
    }

    // Phương thức private: getArea
    private double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức public mới để in thông tin
    public void printDetails() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
    }
}
