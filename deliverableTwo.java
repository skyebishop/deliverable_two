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

	    boolean[] value = new boolean[100];
	    Random rand = new Random();
	    
	    for (int i = 0; i < numberOfFlips; i++)
	    	System.out.print ((value[i]) ? "heads, " : "tails, ");
	    	System.out.println();
	    }
	    			    	
	    }   	
	    	


