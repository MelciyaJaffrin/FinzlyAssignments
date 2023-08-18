package MethodOverloadingAndOverriding;

public class Main {
	 public static void main(String[] args) {
		 Room r=new Room(1,4,2000);
		 System.out.println(r.toString());
		 r.reservation(2);
		 r.reservation(2,"17-8-2023","18-8-23");
		 
	    }

}
