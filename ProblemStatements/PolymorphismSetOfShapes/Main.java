package PolymorphismSetOfShapes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7.2);
		c.calculateArea();
		c.calculatePerimeter();
		
		Rectangle r = new Rectangle(2.0,4.5);
		r.calculateArea();
		r.calculatePerimeter();
		
		Triangle t = new Triangle(2.0,4.0,6.0);
		t.calculateArea();
		t.calculatePerimeter();

	}

}
