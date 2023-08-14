package DoWhileLoop;

public class Six {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do {
			if(i%2==0) {
				sum= sum+i;
				
			}
			i++;
		}
		while(i<=50);
		System.out.println(sum);

	}

}
