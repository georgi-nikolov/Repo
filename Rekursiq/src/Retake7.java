import java.util.Scanner;
public class Retake7 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int input = input();
		getNumsDivByThree(input,1,3);
	}
	static int input(){
		int input = 0;
		boolean flag = false;
		do{
			System.out.println("Enter a number: ");
			if(userInput.hasNextInt()){
				input = userInput.nextInt();
				flag = true;
			}
			else{
				userInput.next();
				System.out.println("Invalid input.");
			}
		}
		while(!flag);
		return input;
	}
	static int getNumsDivByThree(int input, int counter, int temp){
		if(counter == 6)
			return input;
		System.out.print(temp + " ");
		return getNumsDivByThree(input, counter+1, temp+3);	
	}
}
