import java.util.Scanner;
public class Task5 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int cells;
		int rows;
		float sum = 0;
		float temp = 0;
		int counter = 0;
		
		do{
			System.out.println("Enter the number of rows: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			rows = userInput.nextInt();
		}
		while(rows<0);
		
		do{
			System.out.println("Enter the value for cells: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			cells = userInput.nextInt();
		}
		while(cells<0);
		
		float[][] matrix = new float[rows][cells];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter the value for row " + (i+1) + " cell " + (j+1) + ": ");
				matrix[i][j] = userInput.nextFloat();
			}
		}
		for (int i = 0; i < matrix[rows-1].length; i++) {
			for (int j = 0; j < matrix[cells-1].length; j++) {
				temp = temp + matrix[i][j];
			}
			if(temp>sum){
				sum = temp;
				counter++;
			}
		}
		System.out.print("The values are ");
		for (int i = 0; i < matrix[cells-1].length; i++) {
			 System.out.print(matrix[counter-1][i] + ", ");
		}
		System.out.println();
		System.out.println("The row is " + (counter));
	}
}
