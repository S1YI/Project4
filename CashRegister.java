import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CashRegister {

    //Static method
    static void Checkout(RetailItem num[]){
        double totalCost = 0;
        for(int x = 0; x < num.length; x++){
            System.out.println("Item: " + (num[x]));
            //gets price for each object
            totalCost += num[x].getPrice();
        }
        DecimalFormat f = new DecimalFormat("#.##");
        String form = f.format(totalCost);
        System.out.println("Your total is: $" + form);
    }

}
