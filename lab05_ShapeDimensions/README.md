Assignment 05: Shape Dimensions 

📌 Description 

This project demonstrates Shape Calculations in Java using Object-Oriented Programming (OOP). It includes different shape classes to calculate area, volume, and perimeter.

📂 File Structure 

1️⃣ Shape.java 

Defines the base class Shape, which serves as a blueprint for different shapes. 


Methods & Functions: 

double calculateArea() – Abstract method to compute area.
double calculatePerimeter() – Abstract method to compute perimeter. 

2️⃣ Circle.java 

Represents a circle, inheriting from Shape.

Methods & Functions:
Circle(double radius) – Constructor to initialize radius.
double calculateArea() – Returns the area of the circle.
double calculatePerimeter() – Returns the circumference of the circle. 

3️⃣ Rectangle.java 

Represents a rectangle, inheriting from Shape.

Methods & Functions:
Rectangle(double length, double width) – Constructor to initialize length and width.
double calculateArea() – Returns the area of the rectangle.
double calculatePerimeter() – Returns the perimeter of the rectangle. 

4️⃣ Pyramid.java 

 
Represents a pyramid, implementing additional volume calculations.

Methods & Functions:
Pyramid(double baseLength, double baseWidth, double height) – Constructor to initialize base and height.
double calculateArea() – Returns the surface area of the pyramid.
double calculateVolume() – Returns the volume of the pyramid. 

5️⃣ Main.java 

The entry point of the program that demonstrates the functionalities of different shapes.

Methods & Functions:
public static void main(String[] args) – Creates shape objects and prints their dimensions. 

 
🛠️ Technologies Used
Java
Object-Oriented Programming (OOP)
