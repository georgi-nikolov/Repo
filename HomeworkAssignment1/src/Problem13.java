import java.util.Scanner;
public class Problem13 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the temprature in C (-100, 100): ");
		if (userInput.hasNextInt()){
		int temp = userInput.nextInt();
			if (temp >= -100 && temp <= 100){
			if (temp < -20){
				System.out.println("The weather is freezing cold.");
			}
			if (temp > -20 && temp <= 0){
				System.out.println("The weather is cold.");
			}
			if (temp > 0 && temp <= 15){
				System.out.println("The weather is moderately cold.");
			}
			if (temp > 15 && temp <= 25){
				System.out.println("The weather is warm.");
			}
			if (temp > 25){
				System.out.println("The weather is hot.");
			}
			}
			else{
				System.out.println("The number is not in the specified range!");
			}
			}
		else{
			System.out.println("That is not a whole number!");
			}
			}
			}
