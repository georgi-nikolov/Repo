import java.util.Scanner;
public class Problem2test {


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num;
		int counter = 0;
		
		do{
			System.out.println("Enter the number of cells: ");
			num = userInput.nextInt();
		}
		while (num < 0);
		
		int[] arrayOne = new int[num];
		int[] arrayTwo = new int[num];
		
	
		for (int i=0; i<arrayOne.length; i++){
			System.out.println("Enter a number for cell " + (i+1));
			arrayOne[i] = userInput.nextInt();
		}
		for (int i=0; i<arrayTwo.length/2; i++){
			arrayTwo[i] = arrayOne[i];
			counter++;
		}
		
		for(int i=arrayTwo.length/2; i<arrayTwo.length; i++){
			arrayTwo[i] = arrayOne[counter-1];
			counter--;
		}
		System.out.println("The new array:");
	
		for (int i=0; i<arrayTwo.length; i++){
			System.out.print(arrayTwo[i] + ", ");
		}
		System.out.println();
		System.out.println("The original array:");
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
	}
}
