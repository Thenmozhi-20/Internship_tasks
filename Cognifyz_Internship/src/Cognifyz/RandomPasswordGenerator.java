package Cognifyz;
import java.util.*;

public class RandomPasswordGenerator 
{
	private static String generatePassword(int passwordLength , String combinedChars)
	{
		Random random = new Random();
		
		int l = combinedChars.length();
		StringBuilder password = new StringBuilder();
		
		
		for(int i=0 ; i < passwordLength ; i++)
		{
			int index = random.nextInt(l);
			
			password.append(combinedChars.charAt(index));
		}
		
		return password.toString();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Random Password Generator!");
		
		String numbers = "0123456789";
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "@#$%&*!";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Password Length: ");
		int passwordLength = in.nextInt();
		
		System.out.println("Please answer with 'Yes' or 'No' for the following: ");
		
		System.out.println("Include numbers? (Yes/No): ");
		String nums = in.next();
		
		System.out.println("Include lowercase letters? (Yes/No): ");
		String lowercase = in.next();
		
		System.out.println("Include uppercase letters? (Yes/No): ");
		String uppercase = in.next();
		
		System.out.println("Include special characters? (Yes/No): ");
		String specialChars = in.next();
		
		String combinedCharacters = " ";
		
		if(nums.equals("Yes")) combinedCharacters = combinedCharacters + numbers;
		if(lowercase.equals("yes")) combinedCharacters = combinedCharacters + lowercaseLetters ;
		if(uppercase.equals("yes")) combinedCharacters = combinedCharacters + uppercaseLetters ;
		if(specialChars.equals("yes")) combinedCharacters = combinedCharacters + specialCharacters ;
		
		if(combinedCharacters.isEmpty())
		{
			System.out.println("You must select at least one character type to generate a password.");
			return ;	
		}
		
		String generatedPassword = generatePassword(passwordLength , combinedCharacters);
		System.out.println("Your randomly generated Password is : "+ generatedPassword);
		
		System.out.println("Thank you for using the Random Password Generator!");
		
	}
}
