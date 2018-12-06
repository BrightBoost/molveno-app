package hotel.Booking;

import hotel.Guest.Guest;
import hotel.Room.Room;

import java.time.LocalDate;
import java.util.Date;

public class Booking {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Room room;
    private Guest guest;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getCheckIn(LocalDate date2) {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

}
