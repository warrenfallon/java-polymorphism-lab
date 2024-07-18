public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        // Call methods on the Rectangle instance
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());
        rect.displayShapeName();
        System.out.println(rect);

        // Call methods on the Circle instance
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        circle.displayShapeName();
        System.out.println(circle);
    }
}

