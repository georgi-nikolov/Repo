import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = userInput.nextInt();
		int sum = 0;
		for (int x = 1; x<=num; x++){
			sum = x+sum;
		}
		System.out.print("The result is: " + sum);
	}
}
