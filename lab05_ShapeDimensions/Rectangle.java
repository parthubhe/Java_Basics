class Rectangle extends Shape{
	//CONSTRUCTOR
	public Rectangle(double length, double width){
	super(length,width,0,4);} //calls the parameterized constructor of Shape Class
		public double calculateArea(){
		 return dim_one * dim_two;
		}
		public double calculatePerimeter(){
			return 2 * (dim_one + dim_two);
		}
	

}