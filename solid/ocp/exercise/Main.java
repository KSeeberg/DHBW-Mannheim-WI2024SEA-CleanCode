package solid.ocp.exercise;

public class Main {
    public static void main(String[] args) {

        Calculator Calculator = new Calculator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape parallelogram = new Parallelogram(8, 3);
        Shape triangle = new Triangle(8, 2);
        
        System.out.println("Circle Area: " + Calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + Calculator.calculateArea(rectangle));
        System.out.println("Parallelogram Area: " + Calculator.calculateArea(parallelogram));
        System.out.println("Triangle Area: " + Calculator.calculateArea(triangle));
    }
}
