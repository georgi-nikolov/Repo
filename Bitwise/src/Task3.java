import java.util.Scanner;
public class Task3 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int input;
		int counter = 0;
		int temp = 0;
		int counterOne = 0;
		
		
		do{
			System.out.println("Enter a whole number: ");
			
			while(!userInput.hasNextInt()){
				System.err.println("Please enter a whole number: ");
			}
			input = userInput.nextInt();
		}
		while(input<0);
		
		for (int i = input; i!=0; i/=2){
			counter++;
		}
			
		
		System.out.println(counter);
		int[] binary = new int[counter];
		
		for (int i=0; i<binary.length; i++) {
			if(input>0){
			temp = input%2;
			binary[i] = temp;
			}
			input/=2;
		}
		
		for (int i = binary.length-1; i >= 0; i--) {
			System.out.print(binary[i] + ", ");
		}
		
		for (int i = 0; i < binary.length; i++) {
			if((binary[i] ^ 1) == 0)
				counterOne++;
		}
		System.out.println();
		System.out.println(counterOne + " of the bits are '1'");
	}
}
