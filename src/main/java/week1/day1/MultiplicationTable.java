package week1.day1;

import java.util.Scanner;

public class MultiplicationTable {

	private static Scanner scan;

	public static void main(String[] args) {

		//1. Get input from user
		int inputNumber;

		scan = new Scanner(System.in);
		inputNumber = scan.nextInt();

		//	1a. /checking the Negative value
		if(inputNumber < 0)
		{
			inputNumber = inputNumber * -1;
		}
		System.out.println("Multiplication Table for " + inputNumber + " is");
		//3. Printing the Table
		for(int i=1;i<=20;i++)
		{

			System.out.println(inputNumber +" * " + i + " = " + inputNumber*i);
		}


	}


}
