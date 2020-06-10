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
	    
	    Random rd = new Random();
	    boolean bn = rd.nextBoolean();
	    int headsCount = 0;
	    int tailsCount = 0;
	    
	    for (int i = 0; i < numberOfFlips; i++)
	    	if (bn == true)   
	    	   headsCount++; 
	    	 else if (bn == false)   
	               tailsCount++; 
	          System.out.println(" heads: " + headsCount + " tails: " + tailsCount);   
	               
	    	
	}
}

         