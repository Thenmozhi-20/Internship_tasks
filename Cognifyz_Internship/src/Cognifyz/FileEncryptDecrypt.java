package Cognifyz;

import java.util.*;
import java.io.*;

public class FileEncryptDecrypt 
{
	private static String processText(String text, int shift)
	{
		StringBuilder result = new StringBuilder();
		
		for(char ch : text.toCharArray())
		{
			char shiftChar = (char) (ch + shift) ;
			result.append(shiftChar);
		}
		
		return result.toString();
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any one operation 1.Encrypt  2.Decrypt");
		String operation = in.nextLine().toLowerCase();
		
		System.out.println("Enter file path:");
		String inputPath = in.nextLine();
		
		System.out.println("Enter output file path:");
		String outputPath = in.nextLine();
		
		int shift = 3 ;  // based on Caesar Cipher shift (for encrypt and decrypt operation)
		                 // for encrypt - forward shift
		if(operation.equals("decrypt"))
		{
			shift = -shift ;  // for decrypt - reverse shift
		}
		
		try
		{
			FileReader file1 = new FileReader(inputPath);
			BufferedReader reader = new BufferedReader(file1);
			
			FileWriter file2 = new FileWriter(outputPath);
			BufferedWriter writer = new BufferedWriter(file2);
			
			String line ;
			while((line = reader.readLine()) != null)
			{
				String currentLine = processText(line,shift);
				writer.write(currentLine);
				writer.newLine();
			}
			
			reader.close();
			writer.close();
			
			System.out.println("File "+ operation + "ion completed successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
