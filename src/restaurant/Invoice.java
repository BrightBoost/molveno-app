package restaurant;


public class Invoice {

        private String partNumber;
        private String partDescription;
        private int quantity;
        private double price;
        private double amount;

public Invoice(String number,String description,int theQuantity,double thePrice)

        {

        partNumber=number;
        partDescription=description;
        quantity=theQuantity;
        price=thePrice;
        }

public void setPartNumber(String number) {
        partNumber=number;
}
public void setPartDescription(String description) {
        partDescription=description;
}
public void setQuantity(int theQuantity) {
        quantity=theQuantity;
}
public void setPricePerIten(double thePrice) {
        price=thePrice;
}
public String getPartNumber() {
        return partNumber;
}
public String getPartDescription() {
        return partDescription;
}
public int getQuantity() {
        return quantity;
}
public double getPricePerItem() {
        return price;
}
public double getInvoiceAmount() {
        amount=quantity*price;
        return amount;
}

        }
