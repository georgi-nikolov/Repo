import java.util.Scanner;
public class Retake8 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int input = input();
		printResult(1,input,input-1);
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
				System.out.println("Invalid data.");
			}
		}
		while(!flag);
		return input;
	}
	static void printResult(int counter, int input, int temp){
		if(counter == input+1)
			return;
		for (int i = 0; i < input; i++) {
			System.out.print(temp);
		}
		System.out.println();
		printResult(counter+1,input,temp+2);
	}
}
