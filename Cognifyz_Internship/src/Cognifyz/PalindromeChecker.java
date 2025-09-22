package Cognifyz;
import java.util.*;

public class PalindromeChecker {

	private static String getReverseString(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		String revStr = sb.reverse().toString();
		return revStr ;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Palindrome Checker!");
		
		System.out.println("Please enter a string to check if it's a palindrome:");
		String str = in.nextLine();
		
		String originalStr = str.toLowerCase();
		String revStr = getReverseString(originalStr);
		
		if(originalStr.equals(revStr)) 
		{
			System.out.println("The string you entered is a Palindrome.");
		}
		else
		{
			System.out.println("The string you entered is NOT a Palindrome.");
		}
		System.out.println("Thank you for using the Palindrome Checker!!");
	}
}
