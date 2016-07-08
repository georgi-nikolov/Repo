import java.util.Scanner;
public class Problem12 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int temp =0;
		int[] arrayOne = new int[7];
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.println("Enter a whole number for cell " + (i+1));
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayOne[i] = userInput.nextInt();
		}
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
		temp = arrayOne[0];
		arrayOne[0] = arrayOne[1];
		arrayOne[1] = temp;
		
		arrayOne[2] = arrayOne[2] + arrayOne[1];
		arrayOne[3] = arrayOne[0] + arrayOne[1];
		
		arrayOne[5] = arrayOne[4] * arrayOne[1];
		arrayOne[4] = arrayOne[0] * arrayOne[3];
		
		System.out.println();
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
	}
}
