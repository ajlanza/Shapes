package tech.ajlanza.shapes;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double radius) {
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    @Override
    public String toString() {
        return String.format("Circle{x=%.1f, y=%.1f, radius=%.1f}", getX(), getY(), getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return circle.getX() == getX() &&
                circle.getY() == getY() &&
                circle.getRadius() == getRadius();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
