import java.util.Scanner; 
public class BMI_Calculator {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
	
	double weight;
	double height;
	double BMI;
	String underWeight = "Underweight (BMI = < 18.5)";
	String normalWeight = "Normal weight (BMI = 18.5-24.9)";
	String overWeight = "Over Weight (BMI = 25-29.9)";
	String obesity = "Obesity (BMI >= 30)";
    int option; 
    
    System.out.println("Input '1' if measurements are Imperical and '2' if measurements are Metric:");
		option = scnr.nextInt();
		if (option == 1 ) {
			System.out.print("Input weight in Pounds:");
				weight = scnr.nextDouble();
			System.out.print("Input heigh in inches:");
				height = scnr.nextDouble();
			BMI = (703 * weight) / height;
		System.out.printf("Your BMI is: %.2f(Lb/inch)\n", BMI);
		if (BMI < 18.5) {
			System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", underWeight);
		}
		else if ((BMI >= 18.5) && (BMI <= 24.9)) {
			System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", normalWeight);	
			
		}
		else if ((BMI >= 25) && (BMI <= 29.9)) {
			System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", overWeight);	
			
		}
		else if (BMI >= 30) {
			System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", obesity);	
		}
		}
		else if (option == 2) {
			System.out.print("Input weight in Kilograms:");
			weight = scnr.nextDouble();
		System.out.print("Input heigh in Meters:");
			height = scnr.nextDouble();
		BMI = weight / height;
	System.out.printf("Your BMI is: %.2f(kg/m)\n", BMI);
	if (BMI < 18.5) {
		System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", underWeight);
	}
	else if ((BMI >= 18.5) && (BMI <= 24.9)) {
		System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", normalWeight);	
		
	}
	else if ((BMI >= 25) && (BMI <= 29.9)) {
		System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", overWeight);	
		
	}
	else if (BMI >= 30) {
		System.out.printf("According to the National Heart,Lung and Blood, you fall under the %s category \n", obesity);	
	}	
			
		}
		else {
			System.out.println("No option available");
		}
		
}
}
