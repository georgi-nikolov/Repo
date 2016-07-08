import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int counter = 0;
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
			if (arrayOne[i]>5 && arrayOne[i]%5==0){
				System.out.print(arrayOne[i] + ", ");
				counter++;
			}
			else{
				continue;
			}
		}
		System.out.println();
		System.out.print(counter + " numbers");
	}
}
