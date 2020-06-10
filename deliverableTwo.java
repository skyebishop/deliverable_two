package deliverableTwo;

import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class deliverableTwo {
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    
	    String headsOrTailsGuess;
	    int numberOfFlips;
	        		
	    System.out.println("Guess which will occur more: heads or tails?");
	    	headsOrTailsGuess = scnr.nextLine();
	    System.out.println("How many times shall we flip a coin?");
	    	numberOfFlips = scnr.nextInt();

	    Random randomBoolean = new Random();
	    boolean value = randomBoolean.nextBoolean();
	    
	    int i = 0;
	    while (i < numberOfFlips) {
	    	System.out.println( value );
		    i++;
	    }
	    			    	
	    }   	
	    	
}

