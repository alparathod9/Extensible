// Shape superclass
abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// ShapeCalculator class
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

// Main class to demonstrate polymorphism
class Demo{
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Create instances of different subclasses
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(6, 8);

        // Call the printArea() method with different shape instances
        calculator.printArea(rectangle); // Output: The area of the shape is: 15.0
        calculator.printArea(circle); // Output: The area of the shape is: 50.26548245743669
        calculator.printArea(triangle); // Output: The area of the shape is: 24.0
    }
}