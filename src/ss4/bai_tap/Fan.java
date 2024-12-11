package ss4.bai_tap;

public class Fan {
    // Hằng số cho tốc độ quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    // Phương thức khởi tạo không tham số
    public Fan() {
    }

    // Getter và Setter cho speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter và Setter cho on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString
    @Override
    public String toString() {
        if (on) {
            return "Fan [speed=" + speed + ", color=" + color + ", radius=" + radius + ", fan is on]";
        } else {
            return "Fan [color=" + color + ", radius=" + radius + ", fan is off]";
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        // Tạo đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Tạo đối tượng Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin của cả hai quạt
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
