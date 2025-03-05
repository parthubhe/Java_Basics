import java.lang.Math;

class Pyramid extends Shape {
    private double radius;  // Store radius of the pyramid's base
    private double height;  // Store height of the pyramid

    // Constructor to initialize radius and height
    public Pyramid(double radius, double height) {
        super(radius, 0, 0, 3);  // Calls the constructor of Shape class, where 3 is the number of sides (triangle base)
        this.radius = radius;
        this.height = height;
    }

    // Calculate the perimeter of the base (equilateral triangle)
    public double calculatePerimeter() {
        return 3 * radius;
    }

    // Calculate the volume of the pyramid
    public double calculateVolume() {
        double baseArea = (Math.sqrt(3) / 4) * Math.pow(radius, 2);
        return (1.0 / 3.0) * baseArea * height;
    }

    // Calculate the surface area of the pyramid
    public double calculateArea() {
        double baseArea = (Math.sqrt(3) / 4) * Math.pow(radius, 2);
        double slantHeight = Math.sqrt(Math.pow(radius / 2, 2) + Math.pow(height, 2));
        double faceArea = 0.5 * radius * slantHeight;
        double totalFaceArea = 3 * faceArea;
        return baseArea + totalFaceArea;
    }
}
