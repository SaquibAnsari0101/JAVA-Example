import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        /*Program to calculate monthly mortgage payment using principle amount, interest rate, years
        we are gonna use the formula

        mortgage = p*((r*(1+r)^n)/((1+r)^n-1))
        where,
            p = principle amount of loan
            r = percentage rate of interest per annum
            n = number of months
         */

        Scanner scanner = new Scanner(System.in);   //for taking input

        //variable declaration
        double mortgage, principalAmount, interestRate, years, monthlyInterestRate, sumInterestRateAndOne;

        System.out.print("\tEnter the Principle Amount : ");        //printing on terminal to know which value is program taking
        principalAmount = scanner.nextDouble();                     //taking input for principleAmount

        System.out.print("\tEnter the Number of Years : ");         //printing on terminal to know which value is program taking
        years = scanner.nextDouble();                               //taking input for number of years

        System.out.print("\tEnter the Percentage Interest Rate per Annum : ");  //printing on terminal to know which value is program taking
        interestRate = scanner.nextDouble();                                    //taking input for interestRate

        //converting percentage per annum interestRate into monthly interest rate i.e. dividing interestRate by 12 and also by 100
        monthlyInterestRate = interestRate/(12*100);

        //calculating value of (1+r)^n
        sumInterestRateAndOne = Math.pow((1+monthlyInterestRate),years*12);

        //finally calculating mortgage using formula
        mortgage = principalAmount * ((monthlyInterestRate * sumInterestRateAndOne)/(sumInterestRateAndOne - 1));

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);    //formatting for better view

        System.out.println("\n\tMonthly Mortgage : " + currency.format(mortgage));    //displaying mortgage calculated
    }
}

/*
Example :

    Enter the Priciple Amount : 100000
    Enter the Number of Years : 30
    Enter the Percentage Interest Rate per Annum : 3.92

    Monthly Mortgage : £472.81

    */