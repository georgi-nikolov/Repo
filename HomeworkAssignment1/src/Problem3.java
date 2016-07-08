import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double numOne = userInput.nextDouble();
		
		System.out.println("Enter the second number: ");
		double numTwo = userInput.nextDouble();
		
		double temp;
		temp = numOne;
		numOne = numTwo;
		numTwo = temp;
		
			System.out.println("The numbers in reverse are: " + numOne + " , " + numTwo);
		}
		}
