package restaurant;

import general.Validation;

import java.util.Scanner;

public class  App {
    public static void main (String[] args){
        System.out.println("Welcome to Molveno Restaurant");
        Reservation reservation1 = new Reservation();
        Guest geust1 = new Guest();
        Table table1 = new Table() ;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String x = sc.nextLine();
         geust1.setName(x);
        System.out.println("The name is " + geust1.getName());
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is your telephone number ?");
        String y = sc.nextLine();
        geust1.setMobileNumber(y);
        System.out.println("Your telephone number is  "+ geust1.getMobileNumber());
        String email = "";
        do {
            System.out.println("What is your email address?");
            email = sc.nextLine();
        }
        while(!Validation.isValidEmail(email));

        geust1.setEmail(email);
        System.out.println("Your email  is  "+ geust1.getEmail());
        Scanner sc2 = new Scanner (System.in);

        int z;

            System.out.println("For how many poeple?");

while (!sc2.hasNextInt()) {
    System.out.println("Please enter valid number");
    sc2.nextLine();
}
//2sdafd
z=sc2.nextInt();
table1.setNumberOfChairs(z);


    System.out.println("Number of persons are " + table1.getNumberOfChairs());







        reservation1.setGuest(geust1);
        reservation1.setTable(table1);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("What time do you prefer ?");
        String t = sc3.nextLine();
        reservation1.setReservationTime(t);
        System.out.println("We have made a reservation for " + reservation1.getTable().getNumberOfChairs()+ " presons at " + reservation1.getReservationTime());



    }
}

