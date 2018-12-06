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


        System.out.println("Welcome to the Molveno Hotel Portal!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Check-In Date:  (yyyy-MM-dd)");

        String checkIn = scanner.nextLine();

        LocalDate date2 = null;

        //Parsing the String
        date2 = LocalDate.parse(checkIn);//dateFormat.parse(checkIn);

        while (date2.compareTo(LocalDate.now()) < 0) {
            System.out.println("Enter the Correct Check-In Date: (yyyy-MM-dd) ");
            checkIn = scanner.nextLine();
            date2 = LocalDate.parse(checkIn);
        }
        Booking booking = new Booking();
        booking.setCheckIn(date2);

        System.out.println("Enter the Check-Out Date: (yyyy-MM-dd) ");

        String checkOut = scanner.nextLine();

        LocalDate date3 = null;

        date3 = LocalDate.parse(checkOut);

        booking.setCheckOut(date3);

        System.out.println("Guest Count: ");
        int guestCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Rooms are available:" + "\n" + "*Budget = 80 Euro" + "\n" + "*Standard = 100 Euro" + "\n" + "*Lux = 140 Euro");
        System.out.println("Enter your Choice: ");
        String roomChoice = scanner.nextLine();
        System.out.println("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Country: ");
        String country = scanner.nextLine();

        System.out.println("Nationality: ");
        String nnationality = scanner.nextLine();

        Guest guest = new Guest();
        guest.setName(name);
        guest.setEmail(email);
        guest.setPhone(phoneNumber);
        guest.setAddress(address);
        guest.setCountry(country);
        guest.setNationality(nnationality);

        }
        Date date = new Date();
        // display time and date using toString()
        System.out.println(date.toString());

        Room room = new Room();
    }



