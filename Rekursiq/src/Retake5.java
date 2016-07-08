import java.util.Scanner;
public class Retake5 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int one = input();
		int two = input();
		int temp;
		if(one>two){
			temp = two;
			two = one;
			one = temp;
		}
		printNumbers(one,two);
		
	}
	static int input(){
		int input = 0;
		boolean num = false;
		do{
			System.out.println("Enter a number: ");
			if(userInput.hasNextInt()){
				input = userInput.nextInt();
				num = true;
			}	
			else{
				userInput.next();
				System.out.println("Invalid input!");
			}			
		}
		while(!num);
		return input;
	}
	static int printNumbers(int tempOne, int tempTwo){
		if(tempOne == tempTwo+1)
			return tempOne;
		System.out.print(tempOne + " ");
		return printNumbers(tempOne+1,tempTwo);
		
	}
}
	
