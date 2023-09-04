package Task1;

import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {
	public static void main(String[] args) {
        Hotel hotel = new Hotel(); // Create an instance of the Hotel class

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hotel Management System");
            System.out.println("1. Make Reservation");
            System.out.println("2. Check Room Availability");
            System.out.println("3. Manage Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Implement reservation creation logic
                	makeReservation(hotel, scanner);
                    break;
                case 2:
                    // Implement room availability checking logic
                	checkRoomAvailability(hotel,scanner);
                    break;
                case 3:
                    // Implement booking management logic
                	manageBookings(hotel,scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close(); // Close the scanner
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
	
	public static void makeReservation(Hotel hotel, Scanner scanner) {
        System.out.println("Enter guest information");
        System.out.print("Guest ID: ");
        int guestId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Guest Name: ");
        String guestName = scanner.nextLine();
        
        // Create a guest object
        Guest guest = new Guest(guestId, guestName);

        // Display available room types
        System.out.println("Available Room Types:");
        System.out.println("1. Standard");
        System.out.println("2. Deluxe");
        System.out.println("3. Suite");
        System.out.print("Enter room type: ");
        int roomTypeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String roomType = "";
        switch (roomTypeChoice) {
            case 1:
                roomType = "Standard";
                System.out.println("Standard room is booked");
                break;
            case 2:
                roomType = "Deluxe";
                System.out.println("Deluxue room is booked");
                break;
            case 3:
                roomType = "Suite";
                System.out.println("Suite room is booked");
                break;
            default:
                System.out.println("Invalid room type choice.");
                return;
        }

     // Find an available room of the specified type
        Room room = hotel.findAvailableRoomByType(roomType);

        if (room == null) {
            System.out.println("No available rooms of the selected type.");
        } else {
            // Create a RoomReservation
            Reservation reservation = new RoomReservation(roomTypeChoice, guest, room);
            
            // Reserve the room
            hotel.bookRoom(room);

            // Add the reservation to the hotel's list
            hotel.makeReservation(reservation);

            System.out.println("Reservation successful!");
        }
    }
	
	
	public static void manageBookings(Hotel hotel, Scanner scanner) {
	    System.out.println("List of Reservations:");
	    List<Reservation> reservations = hotel.getReservationsByGuest(null);

	    if (reservations.isEmpty()) {
	        System.out.println("No reservations found.");
	    } else {
	        for (Reservation reservation : reservations) {
	            // Display reservation details (you can customize this part)
	            System.out.println(reservation);
	        }
	    }
	}
	
	
	public static void checkRoomAvailability(Hotel hotel, Scanner scanner) {
	    System.out.print("Enter the room type you want to check: ");
	    String roomType = scanner.nextLine();

	    List<Room> availableRooms = hotel.getAvailableRoomsByType(roomType);

	    if (availableRooms.isEmpty()) {
	        System.out.println("No available rooms of the selected type.");
	    } else {
	        System.out.println("Available Rooms of Type " + roomType + ":");
	        for (Room availableRoom : availableRooms) {
	            System.out.println(availableRoom);
	        }
	    }
	}

}
