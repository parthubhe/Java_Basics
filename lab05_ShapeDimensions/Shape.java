//compile time polymorph: method overload
//method polymorphism :method overriding
//abstract: adds functionality to add an implemented(only declared)
import java.util.*;
abstract class Shape{
	 
		protected double dim_one;
		protected double dim_two;
		protected double dim_three;
		protected int num_sides;
		
		//unparametrised constructor
		public Shape(){
			dim_one = dim_two =dim_three = 0;
			num_sides = 0;
			}
			
		//Overloaded Parametrized Constructor 1
		public Shape(double dim_one,double dim_two,double dim_three,int num_sides){
			this.dim_one =dim_one;
			this.dim_two = dim_two;
			this.dim_three = dim_three;
			this.num_sides = num_sides;
		}
		abstract public double calculateArea(); //abstract method
		abstract public double calculatePerimeter();
		abstract public double calculateVolume();
		
		//getter to get no of sides
		public int getNumSides(){
			return num_sides;
		}
		
}