package restaurant;

public class OrderLogic {


    public static double calculateTotalprice(Order order) {
        //get price of all all dishes together
        //get price of all drinks together
        //get price of all customizations together
        double total =0;

        if (order.getDishes() != null) {
            for (Dish dish : order.getDishes()) {
                total = total + dish.getPrice();
            }
        }

        if (order.getDrinks() != null) {
            for (Drink drink : order.getDrinks()) {
                total = total + drink.getPrice();
            }
        }

        if (order.getComstumizations() != null) {
            for (Comstumization c : order.getComstumizations()) {
                total = total + c.getCostumizationPrice();
            }
        }

        return total;

    }


}



