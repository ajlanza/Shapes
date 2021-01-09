package tech.ajlanza.shapes;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle();
            Circle c2 = new Circle(10, 15, 20);

            Triangle t1 = new Triangle();
            Triangle t2 = new Triangle(1, 2, 3, 4, 5, 7);

            System.out.println(c1);
            System.out.println(c2);
            System.out.printf("The area of c2 is %.2f.\n", c2.area());
            System.out.printf("The circumference of c2 is %.2f.\n", c2.circumference());

            System.out.println(t1);
            System.out.println(t2);
            System.out.printf("The area of t1 is %.2f.\n", t1.area());
            System.out.printf("The area of t2 is %.2f.\n", t2.area());
            System.out.printf("the perimeter of t1 is %.2f\n", t1.perimeter());
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
