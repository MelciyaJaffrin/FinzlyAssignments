package WhileLoopSeries;

public class Eight {
	public static void main(String args[]) {
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		int nextValue;
		int i=2;
		while(i<=8) {
			nextValue =a+b;
			a=b;
			b=nextValue;
			System.out.print(nextValue+" ");
			i++;
		}
		
	}

}
