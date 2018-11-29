package restaurant;

import java.util.Scanner;

public class  App {
    public static void main (String[] args){
        System.out.println("Welcome to Molveno Restaurant");
        Reservation reservation1 = new Reservation();
        Guest geust1 = new Guest();
        Table table1 = new Table() ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String x = sc.nextLine();
         geust1.setName(x);
        //System.out.println("The name is " + geust1.getName());
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your phone number:");
        String y = sc.nextLine();
        //test
        geust1.setMobileNumber(y);
        //System.out.println("Your telephone number is  "+ geust1.getMobileNumber());
        Scanner sc2 = new Scanner (System.in);
        System.out.println ("Number of persons:");
        int z = sc2.nextInt();
        table1.setNumberOfChairs(z);
        //System.out.println("Number of persons are " + table1.getNumberOfChairs());
        reservation1.setGuest(geust1);
        reservation1.setTable(table1);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter date and time:");
        String t = sc3.nextLine();
        reservation1.setReservationTime(t);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("We have made a reservation for you: " + "\nName:    " +reservation1.getGuest().getName() + "\nPhone:  " +reservation1.getGuest().getMobileNumber());
        System.out.println("Number of persons:  " + reservation1.getTable().getNumberOfChairs()+ "\nDate and Time:    " + reservation1.getReservationTime());



    }
}

