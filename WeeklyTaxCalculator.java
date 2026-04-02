
import java.util.Scanner;
public class WeeklyTaxCalculator{
    public static void main( String[]args) {
        Scanner input = new Scanner(System.in);
        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        System.out.println("Welcome! Please Enter Your Weekly Income: ");
        weeklyIncome = input.nextDouble();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome <2500) {
            taxRate = 0.20;
        } else{
                taxRate = 0.30;

            }
            taxWithholding = weeklyIncome * taxRate;
            System.out.println("Weekly income: $" + weeklyIncome);
            System.out.println("Tax withholding: $" + taxWithholding);

            input.close();
        }
}