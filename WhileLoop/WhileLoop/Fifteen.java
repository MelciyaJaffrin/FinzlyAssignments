package WhileLoop;

public class Fifteen {
	public static void main(String args[]) {
		int count =0;
		int i=1;
		while(i<=25){
			if(i%2!=0) {
				count+=1;
			}
			i++;
		}
		System.out.print(count);
	}

}
