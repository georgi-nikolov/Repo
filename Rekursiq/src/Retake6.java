import java.util.Scanner;
public class Retake6 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int input = input();
		int counter = 1;
		int sum = 0;
		System.out.println(printSum(input,counter,sum));
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
			}
		}
		while(!flag);
		return input;
	}
	static int printSum(int input, int counter, int sum){
		if(counter == input+1){
			return sum;
		}
		else{
			sum = sum + counter;
		}
		return printSum(input,counter+1,sum);
	}
}
