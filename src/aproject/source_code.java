package aproject;

import java.util.Scanner;
import static java.lang.System.out;

public class source_code {

	public static void main(String[] args) {
		int theFirstNumber, theSecondNumber, theResult;
		int option;
		Scanner selector, theFirstEnter, theSecondEnter;
		
		
		
			// theNumbers
			
			out.print("Please enter the first number: ");
			theFirstEnter = new Scanner(System.in);
			theFirstNumber = theFirstEnter.nextInt();
			out.println();
			out.print("Please enter the second number: ");
			theSecondEnter = new Scanner(System.in);
			theSecondNumber = theSecondEnter.nextInt();
			out.println();
		
			// menu
		
			out.println("What do you want to do with these numbers?");
			out.printf("1.Summmation\n2.Subtraction\n3.Multiplication\n"
				+ "4.Division\n0.Exit\n");
			out.print("Please enter the number of an option: ");
			selector = new Scanner(System.in);
			option = selector.nextInt();
			out.println();			
		
		
		switch (option) {
			case 1: 
				theResult = calculate.summation(theFirstNumber, theSecondNumber);
				out.printf("%d + %d = %d", theFirstNumber, theSecondNumber, theResult);
				break;
			case 2:
				theResult = calculate.subtraction(theFirstNumber, theSecondNumber);
				out.printf("%d - %d = %d", theFirstNumber, theSecondNumber, theResult);
				break;
			case 3:
				theResult = calculate.multiplication(theFirstNumber, theSecondNumber);
				out.printf("%d * %d = %d", theFirstNumber, theSecondNumber, theResult);
				break;
			case 4:
				theResult = calculate.division(theFirstNumber, theSecondNumber);
				out.printf("%d / %d = %d", theFirstNumber, theSecondNumber, theResult);
				break;
			case 0:
				break;
			default: 
				out.println("There is no such option!"); 
				break;
		}
	}

}
