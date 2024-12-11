package ss6.bai_tap.bai1;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0f, "blue");
        System.out.println(circle);

        circle.setRadius(7.0f);
        circle.setColor("green");
        System.out.println("Hình tròn đã cập nhật: " + circle);


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder.setHeight(15.0f);
        cylinder.setRadius(7.0f);
        cylinder.setColor("orange");
        System.out.println("Hình trụ đã cập nhật: " + cylinder);
    }
}
