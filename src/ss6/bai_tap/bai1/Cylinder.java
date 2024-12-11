package ss6.bai_tap.bai1;

import java.awt.*;

public class Cylinder  extends Circle {
    public float height;

    public Cylinder() {
        super();
        this.height = 1.0f;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float volume() {
        return getArea() * height;

    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + ", volume=" + volume() + "]";
    }
}
