import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = userInput.nextInt();
		int temp = num;
		int remainder = 0;
		int sum = 0;
		while(temp>0){
			remainder = temp%10;
			sum = (sum*10) + remainder;
			temp = temp/10;
		}
		if(num == sum)
			System.out.println("Palindromec");
		else
			System.out.println("ne e palindromec");
	}	
}
