package hotel;

import hotel.Booking.Booking;
import hotel.Guest.Guest;
import hotel.Room.Room;

import java.awt.print.Book;
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
        System.out.println("Welcome to the Molveno Hotel Portal! \n");
        System.out.println("Are you the Owner?");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("y")) {//only takes y or Y
            // get input from user
            choice = scan.nextLine();
            System.out.println();
            System.out.println("Enter The Room Type: \n" );
            Scanner scanner = new Scanner(System.in);
            String TypeOfRoom = scanner.nextLine();
            System.out.println("Enter The Room Price: ");
            Double PriceOfRoom = scanner.nextDouble();
            System.out.println("The room type is " + TypeOfRoom +" & the room price is: "+PriceOfRoom);
        } else {
            System.out.print( "Enter your full name: " );
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.print( "Email: " );
            Scanner email = new Scanner(System.in);
            emailaddress = scanner.nextLine();
            System.out.print( "Phone Number: " );
            Scanner phone = new Scanner(System.in);
            String phoneNumber = scanner.nextLine();
        }
       // Date date = new Date();
      //  System.out.println(date.toString());
        //System.out.println(" " + +" "+);

        Guest guest = new Guest();
        guest.setEmail( emailaddress );
        Room room = new Room();
        Booking booking = new Booking();
    }
}
