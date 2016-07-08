import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a 3-digit number: ");
		if (userInput.hasNextInt()){
		int num = userInput.nextInt();
		if (num >=100 && num <= 999){
			int firstDigit = num /100 %10;
			int secondDigit = num /10 %10;
			int thirdDigit = num %10;
			if (firstDigit == 0 || secondDigit == 0 || thirdDigit ==0){
				System.out.println("The number can not contain a zero");
			}
			else{
			if (num % firstDigit == 0){
				System.out.println("The number is divisable by the first digit.");
			}
			else{
				System.out.println("The number is not divisable by the first digit");
			}
			if (num % secondDigit == 0){
				System.out.println("The number is divisable by the second digit.");
			}
			else{
				System.out.println("The number is not divisable by the second digit");
			}
			if (num % thirdDigit == 0){
				System.out.println("The number is divisable by the third digit.");
			}
			else{
				System.out.println("The number is not divisable by the third digit");
			}
			}
			}
		else{
			System.out.println("The number must be positive and must have 3 digits!");
			}
			}
		else{
			System.out.println("That is not a number!");
			}
			}
			}
