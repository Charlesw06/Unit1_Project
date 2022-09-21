import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner billAmt = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = billAmt.nextDouble();

        Scanner percentOfTip = new Scanner(System.in);
        System.out.print("Enter tip percent: ");
        double tipPercent = percentOfTip.nextDouble();

        Scanner numOfPeople = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numPeople = numOfPeople.nextInt();

        double tipTotal = (Math.round(tipPercent / 10.0 * bill * 10.0) / 100.0);
        double billTotal = bill + tipTotal;
        double tipPerPerson = tipTotal / numPeople;
        double costPerPerson = billTotal / numPeople;

        System.out.println("Total tip: $" + tipTotal);
        System.out.println("Total bill: $" + billTotal);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Cost per person: $" + costPerPerson);
    }
}
