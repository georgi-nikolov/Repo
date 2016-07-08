import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int cells;
		boolean positive = true;
		
		do{
			System.out.println("Enter the number of cells: ");
			while (!userInput.hasNextInt()){
				userInput.nextLine();
				System.out.println("Please enter a whole number");
			}
			cells = userInput.nextInt();
		}
		while(cells<0);
		
		int[] masiv = new int[cells];
		
		for (int i=0; i<masiv.length; i++){
			System.out.println("Enter the value for cell " + (i+1));
			while (!userInput.hasNextInt()){
				userInput.nextLine();
				System.out.println("Please enter a whole number");
			}
			masiv[i] = userInput.nextInt();
		}
		for (int element : masiv) {
			if(element<0){
				positive = false;
				System.out.println("The array contains a negative number!");
			}
			break;
		}
		
		if (positive)
			System.out.println("All the numbers in the array are positive.");
	}
}
