package PolymorphismSetOfShapes;

public class Circle implements Shape {
	
	private double radius;
	Circle(double radius){
		this.radius=radius;
	}
	
	public void calculateArea() {
		double pi=3.14;
		double area = pi*radius*radius;
		System.out.println("Area of Circle is: "+area);
	}
	
	public void calculatePerimeter() {
		double pi =3.14;
		double perimeter =2*pi*radius;
		System.out.println("Perimeter of Circle is: "+perimeter);
	}

}
