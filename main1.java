///2.	Create a Shape class with a method displayShape().Create two subclasses:Circle with a method area() to calculate area of a circle.
import java.util.Scanner;

class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.displayShape();
        System.out.print("Enter radius of the circle: ");
        c.radius = sc.nextDouble();
        c.area();
        sc.close();
    }
}
