package Cognifyz;

import java.util.*;

public class TemperatureConverter 
{
	private static double findCelsius(double temp)
	{
		return (temp * 9/5) + 32 ;
	}
	private static double findFahrenheit(double temp)
	{
		return (temp -32) * 5/9 ;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Temperature Converter!");
		
		System.out.println("Enter the Temperature Value:");
		double temp = in.nextDouble();
		
		System.out.println("Enter the Unit of Measurement (C for Celsius or F Fahrenheit):");
		char unit = in.next().toUpperCase().charAt(0);
		
		if(unit != 'C' &&  unit != 'F') 
		{
			System.out.print("Invalid unit entered. Please restart and enter 'C' or 'F' only.");
			return ;
		}
		
		if(unit == 'C')
		{
			double result = findFahrenheit(temp);
			System.out.printf("%.2f°C is equal to %.2f°F\n",temp,result);
		}
		else
		{
			double result=  findCelsius(temp);
			System.out.printf("%.2f°F is equal to %.2f°C\n",temp,result);
		}
		
		System.out.println("Thank you for using the Temperature Converter!");
		
	}
}
