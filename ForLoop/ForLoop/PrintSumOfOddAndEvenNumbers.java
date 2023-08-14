package ForLoop;

public class PrintSumOfOddAndEvenNumbers {

	public static void main(String[] args) {
		int i, oddSum=0,evenSum=0;
		for(i=1;i<=100;i++) {
			if(i%2!=0) {
				oddSum += i; 
				
			}
			else {
				evenSum += i;
			}
		}
		System.out.println("Odd sum is:"+oddSum);
		System.out.println("Even sum is:"+evenSum);
	}

}
