package javatasks;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		// Finding its prime number or not
		
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = objscan.nextInt();
		 // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
      
        if (num <= 1) 
        {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors from 2 to the square root of the number
        
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0) 
            {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }

        // If no factors were found, the number is prime
        return true;
	}
}


//Output:
	
	//Enter a number: 
		//27
		//27 is not a prime number.
