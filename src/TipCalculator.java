import java.util.Scanner;
import java.text.DecimalFormat;
// Imports Scanner and DecimalFormat

public class TipCalculator {
    public static void main(String[] args) {
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        // Sets the decimal format to two digits after the decimal point

        Scanner billAmt = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = billAmt.nextDouble();
        // Creates scanner for bill amount and prompts user

        Scanner percentOfTip = new Scanner(System.in);
        System.out.print("Enter tip percent: ");
        double tipPercent = Math.round(percentOfTip.nextDouble()) / 100.0;
        // Creates scanner for tip percent and prompts user

        Scanner numOfPeople = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numPeople = numOfPeople.nextInt();
        // Creates scanner for number of people and prompts user

        double tipTotal = tipPercent * bill;
        double billTotal = bill + tipTotal;
        double tipPerPerson = tipTotal / numPeople;
        double costPerPerson = billTotal / numPeople;
        // Initializes variables for calculations

        System.out.println("------------------------");
        System.out.println("Total tip: $" + twoDForm.format(tipTotal));
        System.out.println("Total bill: $" + twoDForm.format(billTotal));
        System.out.println("Tip per person: $" + twoDForm.format(tipPerPerson));
        System.out.println("Cost per person: $" + twoDForm.format(costPerPerson));
        // Displays the results to user in proper money form (two digits after decimal)
    }
}
