import java.util.Scanner;
public class Problem24 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = userInput.nextInt();
		int num = a;
		int dig;
		int rev = 0;
	 
		do{
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10; 
		}
		while (num > 0);
		if (a==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not.");
		}
	}
}
