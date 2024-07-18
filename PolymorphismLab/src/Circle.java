
public class Circle extends Shape {
    private final double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden methods
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Circle");
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}



