import java.util.Scanner;
public class HW8 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String input = input();
		boolean result = palindromeCheck(input);
		printResult(result);
	}
	
	static String input(){
		System.out.println("Enter a word: ");
		String word = userInput.nextLine();
		return word;
	}
	static boolean palindromeCheck(String a){
		boolean result = true;
		String one = a;
		int counter = 0;
		for (int i = one.length()-1; i !=0 ; i--) {
			if(one.charAt(i) != a.charAt(counter)){
				result = false;
				break;
			}
			counter++;
		}
		return result;
	}
	
	static void printResult(boolean a){
		if(a)
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");
	}
}
