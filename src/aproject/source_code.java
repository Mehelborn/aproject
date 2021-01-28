package aproject;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class source_code {

	public static void main(String[] args) throws IOException {
		Scanner sourceFile = new Scanner(new File("data//expressions.txt"));
		int number1 = sourceFile.nextInt();		
		String token = sourceFile.next();
		int result = 0;
		int number2 = sourceFile.nextInt();
		if (token.equals("+")) result = number1 + number2;
		else if (token.equals("-")) result = number1 - number2;
		else if (token.equals("*")) result = number1 * number2;
		
		System.out.println(number1 + " - " + number2 + " = " + result);
		
	}

}
