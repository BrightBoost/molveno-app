package restaurant;

public class ComstumizationLogic {
    public static double calculateCustomizationPrice(Comstumization c)
    {
        double total = c.getEffortPrice() + c.getIngredient().getPriceIngredients();
        return total;
    }
}
