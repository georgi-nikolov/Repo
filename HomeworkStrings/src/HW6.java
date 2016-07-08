import java.util.Scanner;
public class HW6 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String input = input();
		String[] names = getWords(input);
		printResult(upperCaseFirstLetter(names));
	}
	
	static String input(){
		System.out.println("Enter a sentence: ");
		String input = userInput.nextLine();
		return input;
	}
	
	static String[] getWords(String one){
		String[] names = one.split(" ");
		return names;
	}
	static String[] upperCaseFirstLetter(String[] one){
		for (int i = 0; i < one.length; i++) {
			String firstChar = one[i].substring(0,1).toUpperCase();
			one[i] = firstChar + one[i].substring(1);
		}
		return one;
	}
	
	static void printResult(String[] one){
		for (int i = 0; i < one.length; i++) {
			System.out.print(one[i] + " ");
		}
	}
}
