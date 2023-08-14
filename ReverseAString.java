import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String revStr ="";
		char ch;
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			revStr = ch+revStr;
			
		}
		System.out.println("Reversed String is: "+revStr);
		

	}

}
