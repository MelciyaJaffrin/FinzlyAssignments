package PolymorphismSetOfShapes;

public class Triangle implements Shape {
	
	private double base;
	private double height;
	private double side;
	
	public Triangle(double base, double height, double side) {
		super();
		this.base = base;
		this.height = height;
		this.side = side;
	}
	
	public void calculateArea() {
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is: "+area);
	}
	
	public void calculatePerimeter() {
		double perimeter = base+height+side;
		System.out.println("Perimeter of Triangle is: "+perimeter);
	}

}
