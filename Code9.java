package javatasks;

import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		// Senior citizen or not
		
		Scanner objscan=new Scanner (System.in);
		System.out.println("Enter your age :");
		int age =objscan.nextInt();
		if(age>60)
		{
			System.out.println("The person is a Senior Citizen");
		}
		else
		{
			System.out.println("The person is not an Senior Citizen");
		}
	}

}

//Output:

//Enter your age :
//24
//The person is not an Senior Citizen
