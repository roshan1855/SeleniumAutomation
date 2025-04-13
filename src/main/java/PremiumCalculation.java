import java.util.*;

public class PremiumCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Buy Quantity: ");
        double buy_Qty = scanner.nextDouble();

        System.out.print("Enter Buy Price: ");
        double buy_Price = scanner.nextDouble();

        System.out.print("Enter Sell Quantity: ");
        double sell_Qty = scanner.nextDouble();


        System.out.print("Enter Sell Price: ");
        double sell_Price = scanner.nextDouble();

        optionPremium(buy_Qty, buy_Price, sell_Qty,sell_Price);


    }

    public static void optionPremium(double buy_Qty,double buy_Price,double sell_Qty,double sell_Price){

        double premium=    sell_Qty*sell_Price- buy_Qty*buy_Price;
        System.out.println("\n\tTotal Premium received will be : "+premium);


    }
}
