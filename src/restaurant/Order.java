package restaurant;

import restaurant.Reservation.Table;
import java.util.List;
import restaurant.Reservation.Table;

public class Order {
    private long id;
    private List<Dish> dishes;
    private Drink[] drinks;
    private double totalPrice;
    private Table table;
    private Guest guest;
    private List<Comstumization> comstumizations;

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Drink[] getDrinks() {
        return drinks;
    }


    public List<Comstumization> getComstumizations() {
        return comstumizations;
    }

    public void setComstumizations(List<Comstumization> comstumizations) {
        this.comstumizations = comstumizations;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }


}
