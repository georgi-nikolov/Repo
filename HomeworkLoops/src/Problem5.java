import java.util.Scanner;
public class Problem5 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
	
		System.out.println("Enter the first number: ");
		int numOne = userInput.nextInt();
	
		System.out.println("Enter the second number: ");
		int numTwo = userInput.nextInt();
	
		if (numOne < numTwo){
			for (int x=numOne; x<=numTwo; x++){
				System.out.print(x + " ");
			}
		}
		else{
			for (int x=numTwo; x<=numOne; x++){
			System.out.print(x + " ");
			}
		}
	}
}
