package restaurant;

public class DishLogic {

    public static double calculateDishprice(Dish dish) {
        //get price of all all dishes together
        //get price of all drinks together
        //get price of all customizations together
        double total = 0;

        for (Ingredient ingredient : dish.getIngredients()) {
            total = total + ingredient.getPriceIngredients();
        }


        return total;

    }


}