package AbstractionAndInterface;

public class Rectangle implements Shape {
	public void calculateArea(int l,int b){
		double area = l*b;
		System.out.println("Area of rectangle is: "+area);
	}
	
	public void calculatePerimeter(int l,int b) {
		double p=2*(l+b);
		System.out.println("Perimeter of rectangle is: "+p);
		
	}

	@Override
	public void calculateArea(int r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(int r) {
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
