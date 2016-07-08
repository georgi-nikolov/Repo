import java.util.Scanner;
public class Task3 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String one = input();
		boolean check = palindromeCheck(one);
		printResult(check);
			
		
	}
	static String input(){
		System.out.println("Enter a string: ");
		String input = userInput.nextLine();
		return input;
	}
	static boolean palindromeCheck(String input){
		String temp = input;
		int counter = input.length();
		boolean palindrome = true;
		for (int i = 0; i < input.length(); i++) {
			if(temp.charAt(counter-1) != input.charAt(i)){
				palindrome = false;
			break;
			}
			counter--;
		}
		return palindrome;
	}
	static void printResult(boolean palindrome){
		if(palindrome)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
