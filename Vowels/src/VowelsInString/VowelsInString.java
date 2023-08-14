package VowelsInString;
import java.util.*;

public class VowelsInString {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			String s = sc.nextLine();
			String s1 = s.toLowerCase();
			char str[] = s1.toCharArray();
			int n = str.length;
	        System.out.println(removeDuplicate(str, n));
	        
			int count =0;
			for(int i=0;i<n;i++) {
				if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
					count+=1;
				}
			}
			if(count == 5) {
				System.out.println("All vowels are present in "+s);
			}
			else {
				System.out.println("The word does not contain all vowels");
			}
			

		}
		static String removeDuplicate(char str[], int n)
	    {
	        
	        int index = 0;
	        for (int i = 0; i < n; i++)
	        {
	        	int j;
	            for (j = 0; j < i; j++)
	            {
	                if (str[i] == str[j])
	                {
	                    break;
	                }
	            }
	 
	         
	            if (j == i)
	            {
	                str[index++] = str[i];
	            }
	        }
	        return String.valueOf(Arrays.copyOf(str, index));
	    }

	

}
