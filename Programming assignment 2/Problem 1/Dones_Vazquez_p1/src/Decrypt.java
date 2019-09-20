import java.util.Scanner;
public class Decrypt {

		public static void main(String [] args) {
			Scanner scnr = new Scanner(System.in);
			//create data type for int 
		int inputNum; 
		int numPosition1;
		int numPosition2;
		int numPosition3;
		int numPosition4;
		int numSwapper;
			
		//do a scan for a for digit function 
		System.out.print("Enter your four digits:");
		inputNum = scnr.nextInt();
		
        numPosition1 = (inputNum / 1000);		
		//Testing step
		//System.out.println("Position 1 " + numPosition1);
		
		numPosition2 = ((inputNum / 100) % 10);
		//Testing step
		//System.out.println("Position 2 " + numPosition2);
		
		numPosition3 = ((inputNum / 10) % 10);
	  //Testing step
		//System.out.println("Position 3 " + numPosition3);
		
		numPosition4 = (inputNum % 10);
	  //Testing Step 
	//	System.out.println("Position 4 " + numPosition4);
		
		
		numSwapper = 0;
		//swap the first digit with the third
			numSwapper = numPosition3;
			numPosition3 = numPosition1;
			numPosition1 = numSwapper;
			//swap the second digit with the fourth
			numSwapper = numPosition4; 
			numPosition4 = numPosition2;
			numPosition2 = numSwapper; 
			
			//testing print 
			//System.out.println("Numbers swapped: " + numPosition1 + "" + numPosition2 + "" + numPosition3 + "" + numPosition4);
			
			numPosition1 = (numPosition1 % 10) + 3;
			//Testing step
			System.out.print(numPosition1 % 10);
			
			numPosition2 = (numPosition2 % 10) + 3;
			//Testing step
			System.out.print(numPosition2 % 10);
			
			numPosition3 = (numPosition3 % 10) + 3; // % 10;
			//Testing step
			System.out.print(numPosition3 % 10);
			
			numPosition4 = (numPosition4 % 10) + 3;
			//Testing step
			System.out.print(numPosition4 % 10);
		}
}
