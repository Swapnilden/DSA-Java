/*
(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.

			Sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent

Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.

Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
you have to generate in order to make $30,000.
*/

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int commission = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base Salary: ");
        double baseSalary = input.nextDouble();

        if (baseSalary >= 10000.01){
            commission += (baseSalary*12)/100;
            baseSalary = baseSalary - 10000.01;
        }

        if(baseSalary >= 5000.01){
            commission += (baseSalary*10)/100;
            baseSalary = baseSalary - 5000.01;
        }

        commission += (baseSalary*8)/100;

        System.out.println("The commission is: " + commission);
        
    }
}
