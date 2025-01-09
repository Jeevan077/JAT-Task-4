package javatasks;

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		// Factorial of a given number
		
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter a number: ");
	      int num = scanner.nextInt();

	        // Calculate factorial
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }

	        // Print the factorial
	        System.out.println("The factorial of " + num + " is: " + factorial);

	}

}

//Output:
//Enter a number: 7
//The factorial of 7 is: 5040