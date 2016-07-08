import java.util.Scanner;
public class Problem18 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter the number of cells: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			num = userInput.nextInt();
		}
		while(num <= 0);
		int[] arrayOne = new int[num];
		int[] arrayTwo = new int[num];
		int[] arrayThree = new int[num];
		
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + " for the 1st Array");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayOne[i] = userInput.nextInt();
		}
		
		for(int i=0; i<arrayTwo.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + " for the 2nd Array");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayTwo[i] = userInput.nextInt();
		}
		
		for (int i=0; i<arrayOne.length; i++){
			if (arrayOne[i]>arrayTwo[i]){
				arrayThree[i] = arrayOne[i];
			}
			else if (arrayOne[i]<arrayTwo[i]){
				arrayThree[i] = arrayTwo[i];
			}
		}
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
		System.out.println();
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayTwo[i] + ", ");
		}
		System.out.println();
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayThree[i] + ", ");
		}
	}
}
