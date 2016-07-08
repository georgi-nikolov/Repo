import java.util.Scanner;
public class Task4 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String input = input();
		int[] result = new int[26];
		result = check(input,alphabet);
		printResult(alphabet,result);
	}
		
		static String input(){
		System.out.println("Enter some text: ");
		String text = userInput.nextLine();
		text = text.toLowerCase();
		return text;
	}
	static int[] check(String input, String alphabet){
		int[] result = new int[26];
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < alphabet.length() ; j++) {
				if(input.charAt(i) == alphabet.charAt(j))
					result[j]++;
			}
		}
		return result;
	}
	static void printResult(String alphabet, int[] result){
		for (int i = 0; i < result.length-1; i++) {
			System.out.print(alphabet.charAt(i) + " - " + result[i] + " / ");
		}
	}
}
