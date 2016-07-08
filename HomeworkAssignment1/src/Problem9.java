import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first 2 digit number: ");
		int numOne = userInput.nextInt();
		
		System.out.println("Enter the second 2 digit number: ");
		int numTwo = userInput.nextInt();
		
		int mult = numOne * numTwo;
		int lastDigit = mult % 10;
		if ((numOne >=10 && numOne <=99) && (numTwo >=10 && numTwo <=99)){
		if ((mult % 2) >0){
			System.out.println(mult);
			System.out.println(lastDigit + " is odd.");
		}
		else{
			System.out.println(mult);
			System.out.println(lastDigit + " is even.");
		}
		}
		else{
			System.out.println("Invalid data entered.");
		}
		}
		}
		
