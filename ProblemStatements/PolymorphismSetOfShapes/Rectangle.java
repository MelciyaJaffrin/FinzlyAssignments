package PolymorphismSetOfShapes;

public class Rectangle implements Shape{
	
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void calculateArea() {
		double area= width*height;
		System.out.println("Area of Rectangle is: "+area);
	}
	
	public void calculatePerimeter() {
		double perimeter=2*(width+height);
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}

}
