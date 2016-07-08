import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a 4 digit number");
		if (userInput.hasNextInt()){
		int num = userInput.nextInt();
		if (num >= 1000 && num<= 9999){
			int firstDigit = num /1000 %10;
			int secondDigit = num /100 %10;
			int thirdDigit = num /10 %10;
			int forthDigit = num %10;
			int newNumOne = Integer.valueOf(String.valueOf(firstDigit) + String.valueOf(forthDigit));
			int newNumTwo = Integer.valueOf(String.valueOf(secondDigit) + String.valueOf(thirdDigit));
			if (newNumOne > newNumTwo){
				System.out.println(newNumOne + " > " + newNumTwo);
			}
			if (newNumOne < newNumTwo){
				System.out.println(newNumTwo + " > " + newNumOne);
			}
			if (newNumOne == newNumTwo){
				System.out.println(newNumOne + " = " + newNumTwo);
			}
		}
		else{
			System.out.println("That is not a 4 digit number");
		}
		}
		else{
			System.out.println("Invalid data type.");
		}
		}
		}
