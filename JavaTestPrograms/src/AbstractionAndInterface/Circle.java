package AbstractionAndInterface;

public class Circle implements Shape {
	public void calculateArea(int r){
		double pi=3.14;
		double area = pi*r*r;
		System.out.println("Area of circle is: "+area);
	}
	
	public void calculatePerimeter(int r) {
		double pi=3.14;
		double p=2*pi*r;
		System.out.println("Perimeter of circle is: "+p);
		
	}

	@Override
	public void calculateArea(int l, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(int l, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea1(int b, int h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(int a, int b, int c) {
		// TODO Auto-generated method stub
		
	}


	

}
