import java.util.Scanner;
public class Problem15 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = userInput.nextInt();
		int temp = 1;
		int sum = 0;
		
		do{
		sum = sum+temp;
		temp++;
		}
		while (temp < num+1);
		System.out.println(sum);
	}
}
