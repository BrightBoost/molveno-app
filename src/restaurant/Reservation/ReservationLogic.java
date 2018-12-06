package restaurant.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationLogic {
    /**
     * check reservation based on user request datetime and current reservation , table
     * @param reservationRequest
     * @param currentReservations
     * @param table
     * @return
     */
    public static boolean checkDateTime(LocalDateTime reservationRequest, List<Reservation> currentReservations, Table table) {
        long tableId = table.getId();

        LocalDateTime min = reservationRequest.minusHours(3);
        LocalDateTime max = reservationRequest.plusHours(3);

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

    /**
     * check available table based on user request(datetime) and tables, reservation
     * adds not reserved tables in table object
     * @param reservationRequest
     * @param tables
     * @param reservations
     * @return
     */
    public static List<Table> getAvailableTables(LocalDateTime reservationRequest, List<Table> tables, List<Reservation> reservations) {
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



