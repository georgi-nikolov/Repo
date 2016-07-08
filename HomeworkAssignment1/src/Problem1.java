import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		double numOne = userInput.nextDouble();

		System.out.println("Enter the second number: ");
		double numTwo = userInput.nextDouble();

		System.out.println("Enter the third number: ");
		double numThree = userInput.nextDouble();

		if (numThree > numOne && numThree < numTwo) {
			System.out.println("The third number is between the first and second");
		}

		else {
			if (numThree < numOne && numThree > numTwo) {
				System.out.println("The third number is between the first and second");
			} else {
				System.out.println("The third number is not between the first and second one");
			}
		}
	}
}
