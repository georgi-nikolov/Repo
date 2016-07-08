import java.util.Scanner;
public class HW7 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		String sentence = input();
		String[] words = getWords(sentence);
		int[] results = {longestWord(words),howManyWords(words)};
		System.out.println("The number of words is " + results[1] + " and the longest words is " + results[0] + " chars long.");
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
	
	static int longestWord(String[] one){
		int counter = 0;
		int max = 0;
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one[i].length(); j++) {
				counter++;
			}
			if(max<counter)
				max=counter;
			counter = 0;
		}
		
		return max;
	}
	
	static int howManyWords(String[] one){
		int counter = 0;
		for (counter = 0; counter < one.length; counter++) {	
		}
		return counter;
	}
	
}
