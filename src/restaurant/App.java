package restaurant;

import general.Validation;
import restaurant.Reservation.Reservation;
import restaurant.Reservation.ReservationLogic;
import restaurant.Reservation.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  App {
    public static void main (String[] args){
        Dish dish1= new Dish();
        Ingredient ingredients1 = new Ingredient();
        Comstumization comstumization= new Comstumization();
        Order order = new Order();


        System.out.println("Welcome to Molveno Restaurant");
        Reservation reservation1 = new Reservation();
        Guest geust1 = new Guest();
        Table table11 = new Table() ;
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




        comstumization.setEffortPrice(40);
        ingredients1.setPriceIngredients(30);
        List<Ingredient> ingredientlist = new ArrayList<>();
        ingredientlist.add(ingredients1);
        comstumization.setIngredient(ingredients1);
        comstumization.setDish(dish1);
        dish1.setIngredients(ingredientlist);

        comstumization.setCostumizationPrice(ComstumizationLogic.calculateCustomizationPrice(comstumization));
        dish1.setDishPrice(DishLogic.calculateDishprice(dish1));



        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);

        List<Comstumization> comstumizations = new ArrayList<>();
        comstumizations.add(comstumization);


        order.setDishes(dishes);
        order.setComstumizations(comstumizations);


        System.out.println(OrderLogic.calculateTotalprice(order));



        LocalDate date = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time = LocalTime.of(10, 0);

        LocalDateTime ReservationRequest = LocalDateTime.of(date, time);
        System.out.println("ReservationRequest is "+ReservationRequest);

        LocalDate date1 = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time1 = LocalTime.of(12, 0);

        LocalDateTime Reservation1 = LocalDateTime.of(date1, time1);

        LocalDate date2 = LocalDate.of(2018, Month.DECEMBER, 05);


        LocalTime time2 = LocalTime.of(23, 0);

        LocalDateTime Reservation2 = LocalDateTime.of(date2, time2);

        List<LocalDateTime> current = new ArrayList<>();
        current.add(Reservation1);
        current.add(Reservation2);
        System.out.println("current is  "+ current);

       // System.out.println(ReservationLogic.checkDateTime(ReservationRequest,current));

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


        List <Table> reserevedTables = new ArrayList<>();
        reserevedTables.add(table1);
        reserevedTables.add(table2);
        reserevedTables.add(table4);

        boolean available = ReservationLogic.checkTable(6,reserevedTables);
        System.out.println(available);




    }
}

