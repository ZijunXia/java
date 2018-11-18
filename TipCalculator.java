
//*************************
//Honor Code: This work is mine unless otherwise cited. 
//Zijun Xia
//CMPSC 111 Fall 2015
//Lab #3
//Date:11 Sept 2015
//
//Purpose: To gain more experiences working with variables and experssions
//************************
import java.util.Date; // needed for printing today's date
import java.util.Scanner;
public class TipCalculator
{
	//----------------
	// main method: program execution begins here
	//----------------
	public static void main(String[] args)
		{
	// Label output with name and date:
	System.out.println("Zijun Xia\n Lab #3\n" + new Date() + "\n");		

	String name;
	double bill;
	double tip;
	double number;
	double tipamount;
	double total;
	double result;

	Scanner userInput = new Scanner (System.in);
	
	System.out.println("Please enter your name:");
	name = userInput.next();

	System.out.println(name + ", welcome to the Tip Calculator!");

	System.out.println("Please enter the amount of your bill:");
	bill = userInput.nextDouble();

	System.out.println("Please enter the percentage that you want to tip:");
	tip = userInput.nextDouble();

	System.out.println("Your orginal bill was $" + bill + "\n");
	tipamount = tip/100*bill;

	System.out.println("Your tip amount is $" + tipamount + "\n");
	total = bill+tipamount;

	System.out.println("Your total bill is $" + total+ "\n");

	System.out.println("How many people will be splitting the bill?");
	number = userInput.nextDouble();
	
	result = total/number;

	System.out.println("Each person should pay $" + result);

	System.out.println("Have a nice day! Thank you for using our service.");

	}
}
