import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int numOne;
		int numTwo;
		boolean length = true;
		boolean equal = true;
		
		do{
			System.out.println("Enter the number of cells for the 1st Array: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			numOne = userInput.nextInt();
		}
		while(numOne <= 0);
		
		do{
			System.out.println("Enter the number of cells for the 2nd Array: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			numTwo = userInput.nextInt();
		}
		while(numTwo <= 0);
		
		float[] arrayOne = new float[numOne];
		float[] arrayTwo = new float[numTwo];
		
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + " of the 1st Array");
			arrayOne[i] = userInput.nextFloat();
		}
		
		for(int i=0; i<arrayTwo.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + " of the 2nd Array");
			arrayTwo[i] = userInput.nextFloat();
		}
		
		if (arrayOne.length == arrayTwo.length){
			for (int i=0; i<arrayOne.length; i++){
				if (arrayOne[i]!=arrayTwo[i])
					equal = false;
			}			
		}
		else{
			length = false;
		}
		
		if (length == true){
			System.out.println("The arrays have equal size.");
		}
		else{
			System.out.println("The arrays have different sizes.");
		}
		
		if (equal == true){
			System.out.println("The arrays have equal elements.");
		}
		else{
			System.out.println("The arrays have different elements.");
		}
	}
}
