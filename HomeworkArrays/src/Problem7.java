import java.util.Scanner;
public class Problem7 {
	
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
		float[] arrayTwo = new float[num];
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1));
			arrayOne[i] = userInput.nextFloat();
		}
		
		arrayTwo[0] = arrayOne[0];
		arrayTwo[arrayTwo.length-1] = arrayOne[arrayOne.length-1];
		
		for (int i=1; i<arrayTwo.length-1; i++){
			arrayTwo[i] = arrayOne[i-1] + arrayOne[i+1];
		}
		
		for (int i=0; i<arrayTwo.length; i++){
			System.out.print(arrayTwo[i] + ", ");
		}
	}
}
