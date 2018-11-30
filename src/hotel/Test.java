package hotel;

import hotel.Booking.Booking;
import hotel.Guest.Guest;
import hotel.Room.Room;

import java.awt.print.Book;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
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
        System.out.println("Enter the Check-In Date: ");

        String checkIn = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date2=null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(checkIn);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date2);

        System.out.println("Enter the Check-Out Date: ");

        String checkOut = scanner.nextLine();

//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date3=null;
        try {
            //Parsing the String
            date3 = dateFormat.parse(checkOut);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date3);

//        String choice = scan.nextLine();
//        if (choice.equalsIgnoreCase("y")) {//only takes y or Y
//            // get input from user
//            choice = scan.nextLine();
//            System.out.println();
//            System.out.println("Enter The Room Type: " );
//            Scanner scanner = new Scanner(System.in);
//            String TypeOfRoom = scanner.nextLine();
//            System.out.println("Enter The Room Price: ");
//            Double PriceOfRoom = scanner.nextDouble();
//            System.out.println("The room type is " + TypeOfRoom +" & the room price is: "+PriceOfRoom);
//        } else {
            System.out.println( "Enter your full name: " );
          //  Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println( "Email: " );
            //Scanner email = new Scanner(System.in);
            String email = scanner.nextLine();
            System.out.println( "Phone Number: " );
           //Scanner phone = new Scanner(System.in);
            String phoneNumber = scanner.nextLine();
        }
       // Date date = new Date();
      //  System.out.println(date.toString());
        //System.out.println(" " + +" "+);

        Guest guest = new Guest();

        Room room = new Room();
        Booking booking = new Booking();
    }

