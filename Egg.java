package eggProblem;

public class Egg {

	  public static void main(String[] args) {
		  
	        long sum=1;
	        System.out.println(sum);
	        for(long i=2;i<=38;i++){
	            sum= (long) (sum+Math.pow(sum,i));
	            System.out.println(sum);
	        }
	  }

}
