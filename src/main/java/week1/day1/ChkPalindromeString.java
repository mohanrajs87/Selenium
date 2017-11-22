package week1.day1;
import java.util.Scanner;

public class ChkPalindromeString {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1. Get input from user
		String inputString,revString = "";

		scan = new Scanner(System.in);
		inputString = scan.nextLine();

		//	1a. Find of the Length of String
		int strLength = inputString.length();
		//2. Reverse the String

		for ( int i = strLength - 1; i >= 0; i-- )
			revString = revString + inputString.charAt(i);

		System.out.println(revString);
		//4.
		if (inputString.equals(revString))
			System.out.println(inputString+" is a palindrome");
		else
			System.out.println(inputString+" is not a palindrome");

	}

}


