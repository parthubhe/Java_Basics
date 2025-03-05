class Circle extends Shape{
	//CONSTRUCTOR
	public Circle(double radius){
	super(radius,0,0,0);} //calls the parameterized constructor of Shape Class
		public double calculateArea(){
		 return 3.14 * dim_one *dim_one;
		}
		public double calculatePerimeter(){
			return 2 * 3.14 * dim_one;
		}
		public double calculateVolume(){
		return 0;}


}