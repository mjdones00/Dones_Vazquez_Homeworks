import java.util.Scanner;
import java.lang.String;

public class Encryption {
	public static void main(String[] args) {
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
	
	//test print step 
	//System.out.println(inputNum);
	
		//replace each digit with the result of adding 7 and a applying a 10 modulus 
		numPosition1 = (((inputNum / 1000) + 7) % 10); 
		
		//Testing step
		//System.out.print(numPosition1);
		
		numPosition2 = (((inputNum / 100) % 10) + 7) % 10;
		
		//Testing step
		//System.out.print(numPosition2);
		
		numPosition3 = (((inputNum / 10) % 10) + 7) % 10; // % 10;
	
		//Testing step
		//System.out.print(numPosition3);
		
		numPosition4 = (((inputNum % 10) + 7) % 10);
	
		//testing step
		//System.out.println(numPosition4);
		
		//swap the first digit with the third
		numSwapper = numPosition1;
		numPosition1 = numPosition3;
		numPosition3 = numSwapper;
		//swap the second digit with the fourth
		numSwapper = numPosition2; 
		numPosition2 = numPosition4;
		numPosition4 = numSwapper; 
		//print out the encrypted four digits
		System.out.println(numPosition1 + "" + numPosition2 + "" +  numPosition3 + "" + numPosition4);
	}
}