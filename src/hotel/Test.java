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

import java.util.Scanner;
import java.util.Date;



public class Test {

    public static void main(String[] args) {

        String emailaddress = " ";

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

        System.out.println( "Welcome to the Molveno Hotel Portal!" );
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter the Check-In Date:  (yyyy-MM-dd)" );

        String checkIn = scanner.nextLine();

        LocalDate date2 = null;

        //Parsing the String
        date2 = LocalDate.parse(checkIn);//dateFormat.parse(checkIn);

        while (date2.compareTo( LocalDate.now() ) < 0) {
            System.out.println( "Enter the Correct Check-In Date: (yyyy-MM-dd) " );
            checkIn = scanner.nextLine();
            date2 = LocalDate.parse(checkIn);
        }

            System.out.println( date2 );
            System.out.println( "Enter the Check-Out Date: (yyyy-MM-dd) " );

            String checkOut = scanner.nextLine();

            LocalDate date3 = null;

            date3 = LocalDate.parse( checkOut );

            System.out.println( date3 );

            //System.out.println( Period.between( date2, date3 ) );

            System.out.println("Rooms are available: ");

            System.out.println( "Enter your full name: " );


            System.out.println( "Welcome to the Molveno Hotel Portal! \n" );
            System.out.println( "Are you the Owner?" );
            Scanner scan = new Scanner( System.in );
            String choice = scan.nextLine();
            //only takes y or Y
            if (choice.equalsIgnoreCase( "y" )) {
                // get input from user
                choice = scan.nextLine();
                System.out.println();
                System.out.println( "Enter The Room Type: \n" );
                //  Scanner scanner = new Scanner(System.in);
                String TypeOfRoom = scanner.nextLine();
                System.out.println( "Enter The Room Price: " );
                Double PriceOfRoom = scanner.nextDouble();
                System.out.println( "The room type is " + TypeOfRoom + " & the room price is: " + PriceOfRoom );
            } else {
                System.out.print( "Enter your full name: " );
                //   Scanner scanner = new Scanner(System.in);

                String name = scanner.nextLine();
                System.out.println( "Email: " );
                String email = scanner.nextLine();
                System.out.println( "Phone Number: " );
                String phoneNumber = scanner.nextLine();
            }

            Date date = new Date();

            // display time and date using toString()
            System.out.println( date.toString() );

            Guest guest = new Guest();

            Room room = new Room();
            Booking booking = new Booking();
        }
    }


