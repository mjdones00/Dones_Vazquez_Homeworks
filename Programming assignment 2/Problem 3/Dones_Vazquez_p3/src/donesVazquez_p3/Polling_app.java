package donesVazquez_p3;

import java.util.Scanner; 
public class Polling_app {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
	
	/*
	 * create 5 topics in an one dimensional array
	 * create a 5 COl 10 ROW dimensional array corresponding to the five topic responses.
	 *ask the user to rate each issue 
	 * all this happening in a while loop that breaks when asked for
	 * 
	 * Results include:
	 * tabular report with the results for the 10 inputs
     * to the right of the table show average of ratings
     * calculate the highest point total (display both the issue and the total of points
     * calculate the lowest point total (display issue and point total	 
	 *
	 */
		String[] topics = new String [5];
		int[][] responses = new int [5][10];
		topics [0] = "Music";
		topics [1] = "Movies";
		topics [2] = "Books";
		topics [3] = "Philosophy";
		topics [4] = "Politics";
		int ratingInput;
		char  continuity; 
		int j =0;
		int i;
		int ratingTotal = 0;
		int inputTotal = 0;
		int inputAvrg = 0;
		int maxTotal = 0;
		int maxPosition = 0;
		int minTotal = 100000;
		int minPosition = 0;
        boolean keepGoing = true; 
		
	while(keepGoing == true) {	
		System.out.println("Enter a number from 1-10 to rate the five topic:");
	for(i= 0; i < 5; ++i) {
	     System.out.println(topics [i]); 
		ratingInput = scnr.nextInt();  
	if ((ratingInput < 1) || (ratingInput > 10) ) {
		System.out.println("Invalid input, try again");
		break; 
	}
		responses[i][j] = ratingInput; 


		}
	System.out.println("To somplete survey once more enter ''y'' if not enter ''n'' ");
	       continuity = scnr.next().charAt(0);
	     if (j == 9) {
	    	 keepGoing = false;
	     }
	       if (continuity == 'y') {
	    	  j++;
	      }
	      else {
	    	  keepGoing = false; 
	      }
	}
	for (i=0; i < 5; ++i) {
		System.out.printf("%-15s", topics[i]);
	
		for (j=0; j < 10; ++j ) {
			System.out.printf("%15d", responses[i][j]);
			ratingTotal += responses[i][j];
			if (responses[i][j] > 0) {
			inputTotal++;
			
			}
		
		}
		if (minTotal >= ratingTotal) {
			minTotal = ratingTotal;
			minPosition = i;}
		inputAvrg = ratingTotal / inputTotal;
		if (maxTotal < ratingTotal) {
			maxTotal = ratingTotal;
			maxPosition = i;
		}
		
		System.out.printf("\t\tAverage rating is: %2d", inputAvrg);
		System.out.println();
		
		inputAvrg = 0;
		ratingTotal = 0;
		inputTotal = 0;
	}
	
	System.out.printf("The highest point total is %d and belong to %s.\n", maxTotal, topics[maxPosition]);
	System.out.printf("The lowest point total is %d and belong to %s.\n", minTotal, topics[minPosition]);
	
}
}