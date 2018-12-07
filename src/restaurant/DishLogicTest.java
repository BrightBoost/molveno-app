package restaurant;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DishLogicTest {
    Dish dish = new Dish();
    Ingredient ingredient1 = new Ingredient();
    Ingredient ingredient2 = new Ingredient();
    Ingredient ingredient3 = new Ingredient();
    Ingredient ingredient4 = new Ingredient();
    Ingredient ingredient5 = new Ingredient();
    Ingredient ingredient6 = new Ingredient();
    List<Ingredient> ingredientList = new ArrayList<>();

    @Before
    public void before()
    {
        ingredient1.setPriceIngredients(3);
        ingredient2.setPriceIngredients(4);
        ingredient3.setPriceIngredients(9);
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);
        ingredientList.add(ingredient3);
        dish.setIngredients(ingredientList);
    }


    @Test
    public void calculateDishpriceTest() {
        assertEquals(16, DishLogic.calculateDishprice(dish), 0);
    }

}
