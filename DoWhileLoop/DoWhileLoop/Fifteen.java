package DoWhileLoop;

public class Fifteen {

	public static void main(String[] args) {
		int i=1;
		int count=0;
		do {
			if(i%2!=0) {
				count+=1;
			}
			
			i++;
		}
		while(i<=25);
		System.out.println(count);

	}

}
