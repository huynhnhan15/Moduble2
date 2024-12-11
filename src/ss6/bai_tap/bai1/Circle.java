package ss6.bai_tap.bai1;

public class Circle {
    private float radius;
    private String color;

    public Circle(float radius, String color) {
        this.radius = 1.0f;
        this.color = "red";
    }

    public String getColor() {
        return color;
    }

    public Circle() {
    }

    public Circle(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ", area=" + getArea() + "]";
    }
}
