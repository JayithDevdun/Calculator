import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        double principle = 0;
        double MonthlyInterest = 0;
        int numberOfPayments = 0;

        while(true){
            System.out.println("principle:");
            principle = scanner.nextDouble();
            if (principle >= 1000 && principle <= 1_000_000){
                break;
            }
            System.out.println("Enter value between 1000 and 1_000_000");
        }

        while(true){
            System.out.println("Annual interest Rate:");
            double interestRate = scanner.nextDouble();
            if (interestRate >= 1 && interestRate <= 30){
                MonthlyInterest = interestRate / PERCENT/ MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }

        while(true){
            System.out.println("Period (Years):");
            int period = scanner.nextInt();
            if (period >= 1 && period <= 30){
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }

        double mortage = principle *(MonthlyInterest * Math.pow(1+ MonthlyInterest, numberOfPayments)/(Math.pow(1+ MonthlyInterest, numberOfPayments)-1));
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage : " + mortageFormatted);

    }
}