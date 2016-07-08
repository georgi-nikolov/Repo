import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double numOne = userInput.nextDouble();
		
		System.out.println("Enter the second number: ");
		double numTwo = userInput.nextDouble();

		System.out.println("Enter the third number: ");
		double numThree = userInput.nextDouble();
		
		if (numOne < numTwo && numOne < numThree){
			System.out.println(numOne);
		}
		if (numTwo < numOne && numTwo < numThree){
			System.out.println(numTwo);
		}
		if (numThree < numOne && numThree < numTwo){
			System.out.println(numThree);
		}
		if (numOne < numTwo && numOne > numThree){
			System.out.println(numOne);
		}
		if (numTwo < numOne && numTwo > numThree){
			System.out.println(numTwo);
		}
		if (numThree < numOne && numThree > numTwo){
			System.out.println(numThree);
		}
		if (numOne > numTwo && numOne < numThree){
			System.out.println(numOne);
		}
		if (numTwo > numOne && numTwo < numThree){
			System.out.println(numTwo);
		}
		if (numThree > numOne && numThree < numTwo){
			System.out.println(numThree);
		}
		if (numOne > numTwo && numOne > numThree){
			System.out.println(numOne);
		}
		if (numTwo > numOne && numTwo > numThree){
			System.out.println(numTwo);
		}
		if (numThree > numOne && numThree > numTwo){
			System.out.println(numThree);
		}
		}
		}
