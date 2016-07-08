import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double numOne = userInput.nextDouble();
		
		System.out.println("Enter the second number: ");
		double numTwo = userInput.nextDouble();
		
		if (numOne < numTwo){
		System.out.println(numOne);	
		System.out.println(numTwo);	
		}
		else{
			System.out.println(numTwo);
			System.out.println(numOne);
		}
		}
		}
	

