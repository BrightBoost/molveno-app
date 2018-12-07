


package restaurant;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ComstumizationLogicTest {

    Ingredient ingredient = new Ingredient();
    Comstumization c = new Comstumization();

    @Before
    public void before() {
        ingredient.setPriceIngredients(7);
        c.setEffortPrice(23);
        c.setIngredient(ingredient);
    }


    @Test
    public void calculateCustomizationPriceTest() {
        assertEquals(30, ComstumizationLogic.calculateCustomizationPrice(c), 0);


    }


}

