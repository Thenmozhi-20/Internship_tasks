package Cognifyz;

import java.util.*;

public class Tic_Tac_Toe_Game
{
   private static void showBoard(char board[][]) 
   {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++)  
        {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(" " + board[i][j] + " ");
                if (j != 2) System.out.print("|");
            }
            System.out.println();
            if (i != 2) 
            {
              System.out.println(" ---+---+---");
            }
        }
        System.out.println();
   }
    
    private static boolean CheckWin(char board[][])
    {
        // check for row 
        for(int i=0 ; i<3 ; i++)
        {
            if(board[i][0] == board[i][1] && 
              board[i][1] == board[i][2] && 
              board[i][0] != ' ')
              return true ;
        }
        
        // check for column 
        for(int j=0 ; j<3 ; j++)
        {
            if(board[0][j] == board[1][j] &&
               board[1][j] == board[2][j] &&
               board[0][j] != ' ') return true ;
         }
         
        // check for 1st diagonal (00 , 11, 22) 
        if(board[0][0] == board[1][1] && 
           board[1][1] == board[2][2] &&
           board[0][0] != ' ' ) return true ;
           
        // check for the 2nd diagonal (02 , 11, 20)
        if(board[0][2] == board[1][1] && 
           board[1][1] == board[2][0] && 
           board[0][2] != ' ') return true ;
           
        return false;

    }
    
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
		char board[][] = new char[3][3];
		
		for(int i=0 ; i<3 ; i++)
		{
		    for(int j=0 ; j<3 ; j++)
		    {
		        board[i][j]=' ';
		    }
		}
		
		// it helps provide the chance alternate way to the two users.
		int moveCount = 0 ; 
		
		System.out.print("Enter Player 1 name : ");
		String player1 = in.nextLine();
		char player1_symbol = Character.toUpperCase(player1.charAt(0));
		
		System.out.print("Enter Player 2 name : ");
		String player2 = in.nextLine();
		char player2_symbol = Character.toUpperCase(player2.charAt(0));
		
		while(true)
		{
		    showBoard(board);
		    char currentPlayer = (moveCount%2==0)? player1_symbol : player2_symbol ;
		    
		    if(currentPlayer == player1_symbol) 
		    System.out.println("Player "+player1 +", enter your move (1-9): ");
		    else
		    System.out.println("Player "+ player2 + ", enter your move (1-9): ");
		    
		    int choice = in.nextInt();
		  
		    if(choice <= 0)
		    {
		        System.out.println("Enter the number between 1 to 9.");
		        choice = in.nextInt();
		    }
		   
		    // from that choice get the row and column index.
		    int row = (choice - 1)/3;
		    int col = (choice - 1)%3;
		    
		    if(board[row][col] == ' ') 
		    {
		        board[row][col] = currentPlayer ;
		        moveCount++ ;
		        
		        if(CheckWin(board))
		        {
		            showBoard(board);
		            if(currentPlayer == player1_symbol)
		            {
		               System.out.print("Player "+ player1 + " Wins!!");
		               break;
		            }
		            else
		            {
		                System.out.print("Player "+ player2 + " Wins!!");
		                break ;
		            }
		        }
		        
		        if(moveCount == 9) 
		        {
		            showBoard(board);
		            System.out.println("It's a Draw Match!!");
		            break ;
		        }
		    }
		    
		    else
		    {
		        System.out.println("That spot is already taken. Try again.");
		    }
		}
		
	}
}
