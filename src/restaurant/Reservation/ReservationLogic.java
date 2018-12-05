package restaurant.Reservation;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationLogic {
    public static boolean checkAvailability(LocalDateTime reservationRequest, List<LocalDateTime> currentReservations){

        LocalDateTime min = reservationRequest.minusHours(3);
        LocalDateTime max = reservationRequest.plusHours(3);

        for(LocalDateTime current : currentReservations)
        {
            if(current.isBefore(max) || current.isAfter(min))
            {
                return false;
            }
        }

        return true;
    }

}
