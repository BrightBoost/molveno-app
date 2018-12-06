package restaurant.Reservation;

import restaurant.Guest;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
    private long id;
    private LocalDateTime ReservationsTime;
    private Guest guest;
    private Table table;



    public LocalDateTime getReservationsTime() {
        return ReservationsTime;
    }

    public void setReservationsTime(LocalDateTime reservationsTime) {
        ReservationsTime = reservationsTime;
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
