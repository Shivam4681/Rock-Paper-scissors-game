//                                Task 3 :- ROCK,PAPER,SCISSORE GAME



import java.util.*;

public class Task3 {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) 
    {
      System.out.println("Enter any one of the following inputs:  ");
      System.out.println("ROCK");
      System.out.println("PAPER");
      System.out.println("SCISSORS");
      System.out.println();
          
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      //Rules of the Game Applied Below:
      /*if both playerMove and computerMove
        produces the same formation, then 
        Game is a tie*/

      if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");
      // if playerMove is ROCK         
      else if (playerMove.equals(Task3.ROCK))
        System.out.println(computerMove.equals(Task3.PAPER) ? "Computer Wins": "Player wins");   
      // if playerMove is PAPER
      else if (playerMove.equals(Task3.PAPER))
        System.out.println(computerMove.equals(Task3.SCISSORS) ? "Computer Wins": "Player wins");   
      // if playerMove is SCISSORS    
      else
        System.out.println(computerMove.equals(Task3.ROCK) ? "Computer Wins": "Player wins");   
    }
    
    /* Get Computer's move using Random 
       class nextInt() method */   
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Task3.ROCK;
        else if(input == 2)
            computermove = Task3.PAPER;
        else
            computermove = Task3.SCISSORS;
            
        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;    
    }
    
    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }    
}