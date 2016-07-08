import java.util.Scanner;
public class Retake10 {
	private static Scanner userInput;
	public static void main(String[] args) {
		 userInput = new Scanner(System.in);
		int input = input();
		
	}
	static int input(){
		int input;
		do{
			System.out.println("Enter a number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			input = userInput.nextInt();
		}
		while(input<=0);
		return input;
	}
	static int primeCheck(int input){
		return input;
	}
}
