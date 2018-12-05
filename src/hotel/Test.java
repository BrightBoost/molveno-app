package hotel;

import hotel.Booking.Booking;
import hotel.Guest.Guest;
import hotel.Room.Room;

    import java.awt.print.Book;
    import java.text.DateFormat;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.time.LocalDate;
    import java.time.Period;
    import java.util.Date;
    import java.util.Scanner;


public class Test {

    public static void main(String[] args)
    {

        String emailaddress=" ";

    /* RoomType luxury = new RoomType();
        luxury.setPrice(200);
        luxury.setType( TypeOfRoom.LUXURY );

        Room testRoom = new Room();
        testRoom.setRoomType(luxury);
        testRoom.setName("LakeView");

        System.out.println("Room Price is: " + testRoom.getRoomType().getPrice());

        Booking booking = new Booking();
        booking.setRoom( testRoom );
        */
        System.out.println("Welcome to the Molveno Hotel Portal!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Check-In Date:  (dd-MM-yyyy)");

        String checkIn = scanner.nextLine();


        LocalDate date2 = null;

        //Parsing the String
        date2 = LocalDate.parse(checkIn);//dateFormat.parse(checkIn);

        System.out.println(date2);
        System.out.println("Enter the Check-Out Date: (dd-MM-yyyy) ");

        String checkOut = scanner.nextLine();

        LocalDate date3=null;

        date3 = LocalDate.parse(checkOut);

        System.out.println(date3);

        System.out.println(Period.between(date2, date3));

        System.out.println();

            System.out.println( "Enter your full name: " );
            String name = scanner.nextLine();
            System.out.println( "Email: " );
            String email = scanner.nextLine();
            System.out.println( "Phone Number: " );
            String phoneNumber = scanner.nextLine();
        }


        Guest guest = new Guest();

        Room room = new Room();
        Booking booking = new Booking();
    }

