package restaurant;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static javafx.application.Platform.exit;
import static org.junit.Assert.*;

public class OrderLogicTest {

    Order order = new Order();

    Comstumization com = new Comstumization();
    List<Comstumization> listCom = new ArrayList<>();

    Drink dr = new Drink();
    List<Drink> drinkList = new ArrayList<>();

    Dish dish = new Dish();
    List<Dish> dishList = new ArrayList<>();

    @Before
    public void before(){
        //set customization price
        com.setCostumizationPrice(5);
        listCom.add(com);
        //set drink price
        dr.setPrice(3);
        drinkList.add(dr);
        //set dishes price
        dish.setDishPrice(2);
        dishList.add(dish);

        order.setComstumizations(listCom);
        order.setDishes(dishList);
        order.setDrinks(drinkList);
    }


    @Test
    public void calculateTotalpriceTest(){
        assertEquals(10, OrderLogic.calculateTotalprice(order), 0);

    }
}
