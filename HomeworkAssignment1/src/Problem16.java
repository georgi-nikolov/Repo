import java.util.Scanner;
public class Problem16 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a three digit number: ");
		if (userInput.hasNextInt()){
		int num = userInput.nextInt();
		if (num >=100 && num <=999){
			int firstDigit = num /100 %10;
			int secondDigit = num /10 %10;
			int thirdDigit = num %10;
			
			if (firstDigit == secondDigit && firstDigit == thirdDigit){
				System.out.println("The 3 digits are eaqual.");
			}
			else if (firstDigit < secondDigit && secondDigit < thirdDigit){
				System.out.println("The digits are in ascending order.");
			}
			else if (firstDigit > secondDigit && secondDigit > thirdDigit){
				System.out.println("The digits are in descending order");
			}
			else{
				System.out.println("The digits are not in order.");
			}
		}
		else{
			System.out.println("The number is not in range!");
		}
		}
		else{
			System.out.println("That is not a number!");
		}
		}
		}
