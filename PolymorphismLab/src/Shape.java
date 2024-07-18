
public abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract double area();
    public abstract double perimeter();
    public abstract void displayShapeName();

    @Override
    public abstract String toString();
}
