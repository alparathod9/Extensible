// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Rectangle class implementing the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Triangle class implementing the Drawable interface
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

// Square class implementing the Drawable interface
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

class Sub{
    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Square();

        // Call the draw() method on each object
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}