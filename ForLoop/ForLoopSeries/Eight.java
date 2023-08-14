package ForLoopSeries;

public class Eight {

	public static void main(String[] args) {
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		int nextTerm;
		for(int i=2; i<=8 ; i++) {
			nextTerm =a+b;
			a=b;
			b=nextTerm;
			
			System.out.print(nextTerm+" ");
		}

	}

}
