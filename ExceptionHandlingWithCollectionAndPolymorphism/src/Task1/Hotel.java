package Task1;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Guest> guests;
    private List<Reservation> reservations;
    private List<Room> rooms;

    public Hotel() {
        guests = new ArrayList<>();
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    // Implement methods to manage guests, reservations, and rooms
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public Guest findGuestById(int guestId) {
        for (Guest guest : guests) {
            if (guest.getGuestId() == guestId) {
                return guest;
            }
        }
        return null; // Guest not found
    }

    // Reservation Management Methods

    public void makeReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> getReservationsByGuest(Guest guest) {
        List<Reservation> guestReservations = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getGuest().equals(guest)) {
                guestReservations.add(reservation);
            }
        }
        return guestReservations;
    }
   
    
    // Room Management Methods

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRoomsByType(String roomType) {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }
    
    public Room findAvailableRoomByType(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                return room;
            }
        }
        return null; // No available room of the specified type
    }
    

    public void bookRoom(Room room) {
        if (room != null) {
            room.reserveRoom();
        }
    }

    public void releaseRoom(Room room) {
        if (room != null) {
            room.releaseRoom();
        }
    }
}






