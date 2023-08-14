package WhileLoop;

public class Nine {

	public static void main(String[] args) {
		int i=1, oddSum=0,evenSum=0;
		while(i<=100) {
			if(i%2!=0) {
				oddSum += i; 
				
			}
			else {
				evenSum += i;
			}
			i++;
		}
		System.out.println("Odd sum is:"+oddSum);
		System.out.println("Even sum is:"+evenSum);

	}

}
