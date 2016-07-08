import java.util.Scanner;

public class AlternateProblem9 {
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
	
		float[] arrayOne = new float[num];
		float value;
		int temp = arrayOne.length-1;
	
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1));
			arrayOne[i] = userInput.nextFloat();
		}
		
		for (int i=0; i<arrayOne.length/2; i++){
			value = arrayOne[i];
			arrayOne[i] = arrayOne[temp];
			arrayOne[temp] = value;
			temp--;
		}
		
		for(int i=0; i<arrayOne.length; i++){
		System.out.print(arrayOne[i] + ", ");
		}
	}
}
