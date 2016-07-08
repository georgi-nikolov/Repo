import java.util.Scanner;
public class Retake9 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int start = input();
		int stop = input();
		printResult(start,stop,0);
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
	static void printResult(int start, int stop, int sum){
		if(start == stop+1 || sum>200)
			return;
		if(start%3==0)
			System.out.print("skip" + start + " ");	
		else{
			System.out.print(start*start + " ");
			sum = sum + start*start;
		}	
		printResult(start+1,stop,sum);
	}
}
