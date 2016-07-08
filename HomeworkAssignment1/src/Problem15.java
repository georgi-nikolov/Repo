import java.util.Scanner;
public class Problem15 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the time (0 - 24)");
		if (userInput.hasNextInt()){
			int time = userInput.nextInt();
			if (time >= 0 && time <= 24){
			if (time >= 4 && time < 9){
				System.out.println("Good morning!");
			}
			if (time >= 9 && time < 18){
				System.out.println("Good afternoon!");
			}
			if (time >= 18 || time < 4){
				System.out.println("Good evening!");
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
