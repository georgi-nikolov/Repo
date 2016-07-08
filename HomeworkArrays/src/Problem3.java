import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		float num;
		
		System.out.println("Enter a number: ");
		num = userInput.nextFloat();
		
		float[] arrayOne = new float[10];
		arrayOne[0] = num;
		arrayOne[1] = num;
		
		for (int i=2; i<arrayOne.length; i++){
			arrayOne[i] = (arrayOne[i-1]+arrayOne[i-2]);
		}
		
		for(int i=0; i<arrayOne.length; i++){
		System.out.print(arrayOne[i] + ", ");
		}
	}
}
