import java.util.Scanner;
public class Problem10 {
//I only saw my mistake when I was going over the code for formatting
// and at this point I did not have time to finish the task properly
// the program will not return the closest to the average value from the array
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] arrayOne = new int[7];
		int sum = 0;
		for (int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1));
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayOne[i] = userInput.nextInt();
		}
		for (int i=0; i<arrayOne.length; i++){
			sum = sum + arrayOne[i];
		}
		float average = sum/arrayOne.length;
		System.out.println("The closest value to the average is :" + (average));
	}
}
