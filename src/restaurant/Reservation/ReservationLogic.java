package restaurant.Reservation;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationLogic {

    public static boolean checkDateTime(LocalDateTime reservationRequest, List<LocalDateTime> currentReservations){

        LocalDateTime min = reservationRequest.minusHours(3);
        LocalDateTime max = reservationRequest.plusHours(3);

        for(LocalDateTime current : currentReservations)
        {
            if(current.isBefore(max) && current.isAfter(min))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean checkTable(int tableId, List<Table> reservedTables){
        for(Table x : reservedTables ){
           // System.out.println(x.getId());
           if (tableId == x.getId()){
               return false;
            }


        }
                return true;
    }

}
