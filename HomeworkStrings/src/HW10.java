import java.util.Scanner;
public class HW10 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String input = input();
		input = addToAscii(input);
		System.out.println(input);
	}
	
	static String input(){
		System.out.println("Enter a word: ");
		String input = userInput.nextLine();
		return input;
	}
	
	static String addToAscii(String a){
		int temp = 0;
		String tempString = a;
		for (int i = 0; i < a.length(); i++) {
			temp = (int)a.charAt(i)+5;
			tempString = tempString.substring(0,i)+(char)temp;
		}
		return tempString;
	}
}
