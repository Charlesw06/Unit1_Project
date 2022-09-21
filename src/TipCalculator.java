import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner billAmt = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = billAmt.nextDouble();
        // Creates scanner for bill amount and prompts user

        Scanner percentOfTip = new Scanner(System.in);
        System.out.print("Enter tip percent: ");
        double tipPercent = percentOfTip.nextDouble();
        // Creates scanner for tip percent and prompts user

        Scanner numOfPeople = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numPeople = numOfPeople.nextInt();
        // Creates scanner for number of people and prompts user

        double tipTotal = (Math.round(tipPercent / 10.0 * bill * 10.0) / 100.0);
        double billTotal = bill + tipTotal;
        double tipPerPerson = tipTotal / numPeople;
        double costPerPerson = billTotal / numPeople;
        // Initializes variables for calculations

        System.out.println("------------------------");
        System.out.println("Total tip: $" + tipTotal);
        System.out.println("Total bill: $" + billTotal);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Cost per person: $" + costPerPerson);
        // Displays the results to user
    }
}
