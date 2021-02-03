/* Program to calculate the expenses of the intial purchase and state and county sales taxes.*/

import java.util.Scanner;

//Don't forget that the upper class doesn't require a semicolon.
public class SalesTax
{
    public static void main(String[] args)
    {
        final float stateTax = 0.04f;
        float stateCharge;
        final float countyTax = 0.02f;
        float countyCharge;
        float purchaseAmount;
        float totalSalesTax;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What was the cost of your purchase today? $");
        purchaseAmount = keyboard.nextFloat();
        //keyboard allows user to input purchase.

        System.out.println("Initial Purchase Cost: $" + purchaseAmount);
        //Charges placed above their initialization to prevent error.
        stateCharge = purchaseAmount * stateTax;
        System.out.println("Cost of 4 percent state sales tax: $" + stateCharge);
        countyCharge = purchaseAmount * countyTax;
        System.out.println("Cost of 2 percent county sales tax: $" + countyCharge);
        totalSalesTax = stateCharge + countyCharge;
        System.out.println("Total Sales Tax: $" + totalSalesTax);
        System.out.println("Total Purchase Cost: $" + (purchaseAmount + totalSalesTax));
        //keyboard.close() is for stopping the keyboard Scanner.
        keyboard.close();
    }

}