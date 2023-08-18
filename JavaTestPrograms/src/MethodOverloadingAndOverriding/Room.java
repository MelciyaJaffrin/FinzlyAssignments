package MethodOverloadingAndOverriding;

public class Room {
	private int roomNumber;
	private int capacity;
	private int pricePerNight;
	private String check_in;
	private String check_out;
	
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", capacity=" + capacity + ", pricePerNight=" + pricePerNight
				+ ", check_in=" + check_in + ", check_out=" + check_out + "]";
	}
	
	
	public Room(int roomNumber, int capacity, int pricePerNight) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
	}
		public boolean checkAvailable(int persons) {
			if(capacity>=persons) {
				return true;
			}
			else {
				return false;
			}
		}
		public void reservation(int persons) {
			if(checkAvailable(persons)==true) {
				System.out.println("Room no "+roomNumber+" is available");
				System.out.println("The price is: "+pricePerNight);
			}
			else {
				System.out.println("Rooms unavailable");
			}
		}
		public void reservation(int persons,String check_in,String check_out) {
			if(checkAvailable(persons)==true) {
				System.out.println("Your room is reserved from "+check_in+" to "+check_out);
				
			}
			else {
				System.out.println("Reservation failed");
			}
		}
		

}
