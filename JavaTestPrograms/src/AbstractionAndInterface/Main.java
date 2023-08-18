package AbstractionAndInterface;

public class Main {
	public static void main(String args[]) {
		Shape s= new Circle();
		s.calculateArea(5);
		s.calculatePerimeter(5);
		
		Shape s1= new Rectangle();
		s1.calculateArea(5,2);
		s1.calculatePerimeter(5,2);
		
		Shape s2= new Triangle();
		s2.calculateArea1(5,2);
		s2.calculatePerimeter(5,2,3);
		
	}

}
