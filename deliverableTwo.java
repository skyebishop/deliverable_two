package deliverableTwo;

import java.util.Scanner;
import java.util.*;

public class deliverableTwo {
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    
	    String headsOrTailsGuess;
	    int numberOfFlips;
	        		
	    System.out.println("Guess which will occur more: heads or tails?");
	    	headsOrTailsGuess = scnr.nextLine();
	    System.out.println("How many times shall we flip a coin?");
	    	numberOfFlips = scnr.nextInt();
	    
	    Random rn = new Random();
	    int minimum = 1;
	    int maximum = 100;
	    int range = maximum - minimum +1; 
	    int randomNumber = rn.nextInt(range);
	    int headsCount;
	    int tailsCount;
	    int correctCount;
	    
	    for (int i = 0; i < numberOfFlips; i++) {
	    	randomNumber = rn.nextInt(range); 
	    	 for (int j = 0; j < 1; j++) {
	    		 if (randomNumber <= 50)   
	    			 System.out.println("heads"); 
	    			 else if (randomNumber >= 51)   
		    			 System.out.println("tails"); 
	    		 for (int k = 0; k < 1; k++) {
	    			 if (randomNumber <= 50)
	    				 headsCount++;
	    			 else if (randomNumber >= 51)
	    				 tailsCount++;
	    			 }
	    		 }
	    	   }
	    } 
		//if headsCount is greater than tailsCount and user picked heads then assign headsCount value to correctCount else if vice versa
	    if 
	    }	    
	    
	    System.out.println( " heads: " + headsCount + " tails: " + tailsCount);
		 System.out.println( " your guess, " + headsOrTailsGuess + " came up " + ? + "time(s).");

	    	
	}

}