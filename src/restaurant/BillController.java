package restaurant;

public class BillController {
    public Bill generateBill(Guest guest, Order order) {
        Bill bill = new Bill();
        bill.setGuest(guest);
        bill.setOrder(order);
        double amount = calculateTotal(order);
        return bill;
    }

    public double calculateTotal(Order order){
        double total = 0;

        return total;
    }
}
