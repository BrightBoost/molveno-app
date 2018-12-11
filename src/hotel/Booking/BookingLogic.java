package hotel.Booking;

import hotel.Room.Room;
import restaurant.Reservation.Reservation;
import restaurant.Reservation.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingLogic {

    public static boolean checkDate(LocalDate checkinRequest, LocalDate checkoutRequest, List<Booking> currentBookings, Room room) {
        int roomId = room.getId();


        for (Booking current : currentBookings) {
            if (current.getRoom().getId() != roomId) {
                continue;
            }
            if (current.getCheckIn().isAfter(checkinRequest) && current.getCheckIn().isBefore(checkoutRequest)) {
                return false;
            }
            if (current.getCheckOut().isAfter(checkinRequest) && current.getCheckOut().isBefore(checkoutRequest)) {
                return false;
            }
        }
        return true;
    }

    public static List<Room> getAvailableRooms(LocalDate checkinRequest, LocalDate checkoutRequest, List<Room> rooms, List<Booking> bookings) {

        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (checkDate(checkinRequest, checkoutRequest, bookings, room)) {
                availableRooms.add(room);
                System.out.println(room.getId());
            }
        }
        return availableRooms;
    }

}
