import java.util.Scanner;
public class Task5 {
private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String input = removeSymbols(input());
		String test = "hellojava";
		boolean[] anagrameCheck = checkAnagrame(input,test);
		if(checkTheAnagrameArray(anagrameCheck))
			System.out.println("Anagrame.");
		else
			System.out.println("Not");
		
	}
	static String removeSymbols(String input){
		input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
		return input;
	}
	static String input(){
		System.out.println("Enter some text: ");
		String input = userInput.nextLine();
		return input;
	}
	
	static boolean[] checkAnagrame(String input, String test){
		boolean[] anagrame = new boolean[input.length()];
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < test.length(); j++) {
				if(input.charAt(i) == test.charAt(j)){
					anagrame[counter] = true;
					counter++;
					break;
				}
			}
		}
		return anagrame;
	}
	static boolean checkTheAnagrameArray(boolean[] anagrame){
		boolean check = true;
		for (int i = 0; i < anagrame.length; i++) {
			if(anagrame[i] == false){
				check = false;
				break;
			}
		}
		return check;
	}
}
