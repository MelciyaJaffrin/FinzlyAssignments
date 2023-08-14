package DoWhileLoop;

public class Ten {
	public static void main(String[] args) {
		System.out.println("Odd Numbers Are:");
		int i=1;
		do {
			if(i%2!=0) {
				
				System.out.println(i);
				
			}
			i++;
		}while(i<=100);
		System.out.println("Even Numbers Are:");
		i=1;
		do {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=100);

	}

}
