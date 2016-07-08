import java.util.Scanner;
public class Task4 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int num;
		
		do{
			System.out.println("Enter a whole number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.err.println("Please enter a whole number: ");
			}
			num = userInput.nextInt();
		}
		while(num<0);
		
		if ((num & (1<<4)) == 0)
			System.out.println("The 5th bit is zero.");
		else
			System.out.println("The 5th bit is a one.");
	}
}
