package DoWhileLoopSeries;

public class Eight {

	public static void main(String[] args) {
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		int i=2,nextValue;
		do {
			nextValue=a+b;
			a=b;
			b=nextValue;
			System.out.print(nextValue+" ");
			i++;
		}while(i<9);

	}

}
