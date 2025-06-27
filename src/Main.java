import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("principle:");
        double principle = scanner.nextDouble();
        System.out.println("Annual interest Rate:");
        double interestRate = scanner.nextDouble();
        System.out.println("Period (Years):");
        int period = scanner.nextInt();

        double MonthlyInterest = interestRate / PERCENT/ MONTHS_IN_YEAR;
        int numberOfPayments = period * MONTHS_IN_YEAR;
        double mortage = principle *(MonthlyInterest * Math.pow(1+ MonthlyInterest, numberOfPayments)/(Math.pow(1+ MonthlyInterest, numberOfPayments)-1));
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage : " + mortageFormatted);

    }
}