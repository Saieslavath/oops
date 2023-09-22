package oops1;





interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Implement the interface in a class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

		public class InterfaceExample {

			
			 public static void main(String[] args) {
			        Circle circle = new Circle(5.0);
			        Rectangle rectangle = new Rectangle(4.0, 6.0);

			        System.out.println("Circle Area: " + circle.calculateArea());
			        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

			        System.out.println("Rectangle Area: " + rectangle.calculateArea());
			        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
			    }
			}
			// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub


