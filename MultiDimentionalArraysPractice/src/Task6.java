import java.util.Scanner;
public class Task6 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int cells;
		int rows;
		int tempResult = 0;
		
		do{
			System.out.println("Enter a number for the rows: ");
			while(!userInput.hasNextInt()){
			userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			rows = userInput.nextInt();
		}
		while(rows<0);
		
		do{
			System.out.println("Enter a number for the cells: ");
			while(!userInput.hasNextInt()){
			userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			cells = userInput.nextInt();
		}
		while(cells<0);
		
		int[][] matrix = new int[rows][cells];
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.println("Enter a character for row " + (i+1) + " " + "cell " + (j+1) + ": ");
				matrix[i][j] = userInput.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) {
			if (tempResult == rows){
				break;
			}
			else{
				System.out.print(matrix[i][tempResult] + ", ");
				tempResult++;
			}
		}
	}
}

