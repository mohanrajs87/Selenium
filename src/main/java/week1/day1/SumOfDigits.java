package week1.day1;
import java.util.Scanner;

public class SumOfDigits {

	private static Scanner scan;

	public static void main(String[] args) {


		//  1. Get input from user
		int inputNumber,quotient,reminder;

		scan = new Scanner(System.in);
		inputNumber = scan.nextInt();

		//	1a. 
		if(inputNumber < 0)
		{
			inputNumber = inputNumber * -1;
		}

		//	2. 
		int sumNumber =0;

		//  3. calculating the total sum
		while(inputNumber != 0)
		{
			quotient = inputNumber / 10;
			reminder = inputNumber % 10;
			inputNumber = quotient;
			sumNumber = sumNumber + reminder;
		}

		System.out.println(sumNumber + " is the total sum");
	}
}




