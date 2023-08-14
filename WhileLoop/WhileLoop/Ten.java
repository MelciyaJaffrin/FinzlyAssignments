package WhileLoop;

public class Ten {

	public static void main(String[] args) {
		System.out.println("Odd Numbers Are:");
		int i=1;
		while(i<=100) {
			if(i%2!=0) {
				
				System.out.println(i);
				
			}
			i++;
		}
		System.out.println("Even Numbers Are:");
		i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
