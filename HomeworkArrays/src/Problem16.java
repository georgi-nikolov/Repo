import java.util.Scanner;
public class Problem16 {

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
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + ": ");
			arrayOne[i] = userInput.nextFloat();
		}
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
		
		System.out.println();
		
		for (int i=0; i<arrayOne.length; i++){
			if (arrayOne[i]<-0.231){
				arrayOne[i] = (float) (((i+1)*(i+1)) + 41.25);
			}
			else{
				arrayOne[i] = arrayOne[i] * (i+1);
			}
		}
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.print(arrayOne[i] + ", ");
		}
	}
}
