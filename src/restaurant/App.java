package restaurant;

import restaurant.Reservation.Reservation;
import restaurant.Reservation.ReservationLogic;
import restaurant.Reservation.Table;


import general.Validation;

import restaurant.Reservation.Reservation;
import restaurant.Reservation.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        Ingredient ingredients1 = new Ingredient();
        Comstumization comstumization1 = new Comstumization();
        Order order = new Order();


       System.out.println("Welcome to Molveno Restaurant");
        Reservation reservation1 = new Reservation();
        Guest geust1 = new Guest();
       // Table table11 = new Table();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String x = sc.nextLine();
        geust1.setName(x);
        System.out.println("The name is " + geust1.getName());
        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is your telephone number ?");
        String y = sc.nextLine();
        geust1.setMobileNumber(y);
        System.out.println("Your telephone number is  " + geust1.getMobileNumber());
        String email = "";
        do {
            System.out.println("What is your email address?");
            email = sc.nextLine();

        }
        while (!Validation.isValidEmail(email));

        geust1.setEmail(email);
        System.out.println("Your email  is  " + geust1.getEmail());
        Scanner sc2 = new Scanner(System.in);

        int z;


        comstumization1.setEffortPrice(40);
        ingredients1.setPriceIngredients(50);
        List<Ingredient> ingredientlist = new ArrayList<>();
        ingredientlist.add(ingredients1);
        comstumization1.setIngredient(ingredients1);
        comstumization1.setDish(dish1);
        dish1.setIngredients(ingredientlist);

        comstumization1.setCostumizationPrice(ComstumizationLogic.calculateCustomizationPrice(comstumization1));
        dish1.setDishPrice(DishLogic.calculateDishprice(dish1));


        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);

        List<Comstumization> comstumizations = new ArrayList<>();
        comstumizations.add(comstumization1);


        order.setDishes(dishes);
        order.setComstumizations(comstumizations);


        System.out.println(OrderLogic.calculateTotalprice(order));


        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time = LocalTime.of(21, 0);

        LocalDateTime ReservationRequest = LocalDateTime.of(date, time);
        System.out.println("ReservationRequest is " + ReservationRequest);

        LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time1 = LocalTime.of(10, 0);

        LocalDateTime Reservation1 = LocalDateTime.of(date1, time1);

        LocalDate date2 = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time2 = LocalTime.of(23, 0);

        LocalDateTime Reservation2 = LocalDateTime.of(date2, time2);

        List<LocalDateTime> current = new ArrayList<>();
        current.add(Reservation1);
        current.add(Reservation2);
        System.out.println("current is  " + current);

        //System.out.println(ReservationLogic.checkDateTime(ReservationRequest, current));

        Table table1 = new Table();
        table1.setId(1);
        table1.setNumberOfChairs(4);
        Table table2 = new Table();
        table2.setId(2);
        table2.setNumberOfChairs(6);
        Table table4 = new Table();
        table4.setId(4);
        table4.setNumberOfChairs(8);
        Table table3 = new Table();
        table3.setId(3);
        table3.setNumberOfChairs(8);
        //boolean timeAvailable = ReservationLogic.checkDateTime(ReservationRequest, current);

        List<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);


        Reservation rese1= new Reservation();
        rese1.setTable(table1);
        rese1.setReservationsTime(Reservation1);

        Reservation rese2= new Reservation();
        rese2.setTable(table2);
        rese2.setReservationsTime(Reservation2);
        List<Reservation> listReservations = new ArrayList<>();

        listReservations.add(rese1);
        listReservations.add(rese2);



      //  System.out.println(ReservationLogic.getAvailableTables(ReservationRequest,tables,listReservations));






    }
}

