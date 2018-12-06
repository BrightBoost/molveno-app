package hotel.Booking;

import restaurant.Reservation.Reservation;
import restaurant.Reservation.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingLogical {

    public static boolean checkDateTime(/*LocalDateTime*/LocalDateTime reservationRequest, List<Reservation> currentReservations, Table table) {
        long tableId = table.getId();

        /*LocalDateTime*/ LocalDateTime min = reservationRequest.minusHours(3);
        /*LocalDateTime*/ LocalDateTime max = reservationRequest.plusHours(3);

        for (Reservation current : currentReservations) {
            if (current.getTable().getId() != tableId) {
                continue;
            }
            if (current.getReservationsTime().isBefore(max) && current.getReservationsTime().isAfter(min)) {
                return false;
            }
        }
        return true;
    }

    public static List<Table> getAvailableTables(/*LocalDateTime*/ LocalDateTime reservationRequest, List<Table> tables, List<Reservation> reservations) {

        List<Table> availableTables = new ArrayList<>();
        for (Table table : tables) {
            if (checkDateTime(reservationRequest, reservations, table)) {
                availableTables.add(table);
                System.out.println(table.getId());
            }
        }
        return availableTables;
    }
}
