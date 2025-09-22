package Cognifyz;
import java.util.*;

public class StudentGradeSystem {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Student Grade Calculator!");
		
		 System.out.println("Enter the number of subjects :");
		int subjects = in.nextInt();
		
		System.out.println("Enter the maximum marks for each subject (like 30,50 or 100): ");
		int maxMarksPerSubject = in.nextInt();
		
		int totalMarks = 0; 

		for(int i=1 ; i<=subjects ; i++)
		{
			System.out.print("Enter marks for subject "+ i + "(out of " + maxMarksPerSubject + "):");
			
			int mark = in.nextInt();
			
			while(mark < 0 || mark > maxMarksPerSubject)
			{
				System.out.print("Invalid marks! Please enter a value between 0 and " + maxMarksPerSubject +" ");
				mark = in.nextInt();
			}
			
			totalMarks += mark ;
		}
		
		int totalPossibleMarks = subjects * maxMarksPerSubject ;
		
		System.out.println("You scored a total of "+ totalMarks +" out off "+ totalPossibleMarks);
		
		double avgMarks = (double) totalMarks/subjects ;
		System.out.printf("Your avgerage mark is : %.2f\n", avgMarks);
		
		if(avgMarks >= 90) System.out.println("Excellent Performance!");
		
		else if(avgMarks >= 75) System.out.println("Good Job!");
		
		else if(avgMarks >= 50) System.out.println("Good, Keep Improving");
		
		else System.out.println("Need to work harder.");
		
		System.out.println("Thank you for using the Student Grade Calculator!");
		
	}
}
