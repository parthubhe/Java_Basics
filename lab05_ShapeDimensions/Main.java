import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1. Rectangle, 2. Circle, 3. Equilateral Pyramid, 4. Exit");
        int choice = s.nextInt();
        s.nextLine();  
        
        switch (choice) {
            case 1:
                System.out.println("Enter length of the rectangle");
                double length = s.nextDouble();
                s.nextLine();  
                System.out.println("Enter width of the rectangle");
                double width = s.nextDouble();
                s.nextLine();  
                Shape rect = new Rectangle(length, width);
                System.out.println("Area of the rectangle: " + rect.calculateArea());
                System.out.println("Perimeter of the rectangle: " + rect.calculatePerimeter());
                System.out.println("Number of sides: " + rect.getNumSides());
                break;
            case 2:
                System.out.println("Enter radius of the circle");
                double radius = s.nextDouble();
                s.nextLine();  
                Shape circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.calculateArea());
                System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
                System.out.println("Number of sides: " + circle.getNumSides());
                break;
            case 3:
                System.out.println("Enter radius of the equilateral pyramid's base");
                double pyramidBaseRadius = s.nextDouble();
                s.nextLine();
                System.out.println("Enter height of the equilateral pyramid");
                double pyramidHeight = s.nextDouble();
                s.nextLine();
                Shape pyramid = new Pyramid(pyramidBaseRadius, pyramidHeight);
                System.out.println("Volume of the equilateral pyramid: " + pyramid.calculateVolume());
                System.out.println("Surface area of the equilateral pyramid: " + pyramid.calculateArea());
                System.out.println("Perimeter of the pyramid base: " + pyramid.calculatePerimeter());
                System.out.println("Number of sides: " + pyramid.getNumSides());
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choice. Try again.");
        }
        
        s.close();
    }
}
