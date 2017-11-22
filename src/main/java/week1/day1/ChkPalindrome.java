package week1.day1;
import java.util.Scanner;

public class ChkPalindrome {

	private static Scanner scan;

	public static void main(String[] args) {


		//1. Get input from user
		int inputNumber,quotient,reminder;

		scan = new Scanner(System.in);
		inputNumber = scan.nextInt();

		//	1a. 
		if(inputNumber < 0)
		{
			inputNumber = inputNumber * -1;
		}

		int originalNumber = inputNumber;


		//	2. 
		int reverseNumber =0;

		//3. calculating the reverseNumber
		while(inputNumber != 0)
		{
			quotient = inputNumber / 10;
			reminder = inputNumber % 10;
			inputNumber = quotient;
			reverseNumber = reverseNumber * 10 + reminder;
		}

		//4.
		if (originalNumber == reverseNumber)
		{
			//	print originalNumber is a palindrome using 
			System.out.println(originalNumber  + " is a Palindrome");
		}
		else
		{	
			//	print OriginalNumber is NOT a palindrome using 
			System.out.println(originalNumber + " is not a Palindrome");
		}


	}
}



