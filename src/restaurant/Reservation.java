package restaurant;

import java.sql.Timestamp;

public class Reservation {
    private long id;

    public String getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    private String reservationTime;
    private Guest guest;
    private Table table;

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
