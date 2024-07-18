public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7, 10);

        System.out.println(circle1);
        System.out.println("Area of circle1: " + circle1.getArea());

        System.out.println(circle2);
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}

