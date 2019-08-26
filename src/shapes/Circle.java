package shapes;

import interfaces.GeometricObject;

import static java.lang.Math.PI;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return (2 * PI * radius);
    }

    public double getArea() {
        return (PI * radius * radius);
    }
}
