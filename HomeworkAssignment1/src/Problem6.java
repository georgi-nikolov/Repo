import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double numOne = userInput.nextDouble();
		
		System.out.println("Enter the second number: ");
		double numTwo = userInput.nextDouble();
		
		System.out.println("Enter the third number: ");
		double numThree = userInput.nextDouble();

		double tempOne = numOne;
		
		numOne = numTwo;
		System.out.println("The first number taking the value of the second: " + numOne);
		
		numTwo = numThree;
		System.out.println("The second number taking the value of the third: " + numTwo);
		
		numThree = tempOne;
		System.out.println("The third number taking the value of the first: " + numThree);
		}
		}
