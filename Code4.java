package javatasks;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		// Swapping two numbers
		
		Scanner objscan=new Scanner (System.in);
		//Before swapping
		System.out.println("Enter the first number : ");
		int num1 = objscan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = objscan.nextInt();
		System.out.println("Before Swapping : ");
		System.out.println("First number is : " +num1);
		System.out.println("Second number is : " +num2);
		
		//After Swapping
		//Using another variable as temp
		
		int temp =num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping : ");
		System.out.println("First number is : " +num1);
		System.out.println("Second number is : " +num2);

	}

}


//Output: Enter the first number : 
//5
//Enter the second number : 
//7
//Before Swapping : 
//First number is : 5
//Second number is : 7
//After Swapping : 
//First number is : 7
//Second number is : 5

