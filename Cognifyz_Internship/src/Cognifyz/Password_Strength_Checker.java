package Cognifyz;

import java.util.* ;

public class Password_Strength_Checker
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Password : ");
		String password = in.nextLine(); 
		
		boolean upperPresent = false;
		boolean lowerPresent = false;
		boolean digitPresent = false;
		boolean specialCharPresent = false;
		
		for(int i=0 ; i<password.length() ; i++)
		{
		    char ch = password.charAt(i);
		    
		    if(Character.isUpperCase(ch)) upperPresent=true ;
		    else if(Character.isLowerCase(ch)) lowerPresent=true ;
		    else if(Character.isDigit(ch)) digitPresent = true ;
		    else specialCharPresent = true ;
		}
		
		if(password.length() < 8)
		{
		    System.out.println("Your password is too short. It should be at least 8 characters long.");
		}
		else if(upperPresent && lowerPresent && digitPresent && specialCharPresent )
		{
		    System.out.println("Strong password! Your password is secure.");
		}
		else if(!digitPresent)
		{
		    System.out.println("Consider adding at least one digit (0-9) to make your password stronger.");
		}
		else if(!upperPresent)
		{
		    System.out.println("Try adding at least one Uppercase letter (A-Z) for better security.");
		}
		else if((upperPresent || lowerPresent) && digitPresent) 
		{
		    System.out.println("Your password is Okay, but try using both uppercase and lowercase letters, digits and special characters.");
		}
		else
		{
		    System.out.println("Weak Password. Use a mix of Uppercase, Lowercase, Digits, and Special Characters.");
		}
		
	}
}