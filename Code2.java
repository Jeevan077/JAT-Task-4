package javatasks;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		//Finding out even number
		
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = objscan.nextInt();
		if (number%2==0)
		{
			System.out.println("It is an even number");
		}
		else
		{
			System.out.println("It is not an even number");
		}		
		

	}

}

//Output:
//Enter a number: 
//8
//It is an even number
