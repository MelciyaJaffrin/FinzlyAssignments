package AbstractionAndInterface;

public class Triangle implements Shape {
	
	public void calculateArea1(int b,int h){
		double area = 0.5*b*h;
		System.out.println("Area of triangle is: "+area);
	}
	
	public void calculatePerimeter(int a,int b,int c) {
		double p=a+b+c;
		System.out.println("Perimeter of triangle is: "+p);
		
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
	public void calculateArea(int l, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(int l, int b) {
		// TODO Auto-generated method stub
		
	}

}
