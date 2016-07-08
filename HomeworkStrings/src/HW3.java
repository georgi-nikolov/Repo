import java.util.Scanner;
public class HW3 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String one = input();
		String two = input();
		print(compareLength(one,two));
		compareElements(one,two);
		
	}
	static String input(){
		String one;
		do{
			System.out.println("Enter a word: ");
			 one = userInput.nextLine();
		}
		while(one.contains(" "));
		return one;
	}
	static String compareLength(String one, String two){
		String result;
		if(one.length()>two.length()){
			result = "The first String is longer.";
		}
		else if (one.length()<two.length()){
			result = "The second String is longer.";
		}
		else{
			result = ("The two Strings have equal lengths.");
		}
		return result;
	}
	static void print(String one){
		System.out.println(one);
	}
	
	static void compareElements(String one, String two){
		int minLength;
		if(one.length()>two.length()){
			minLength = two.length();
		}
		else if (one.length()<two.length()){
			minLength = one.length();
		}
		else{
			minLength = two.length();
		}
		System.out.println("Different chars: ");
		for (int i=0; i<minLength; i++){
			if(one.charAt(i) != two.charAt(i)){
				System.out.println((i+1) + " " + one.charAt(i) + " - " + two.charAt(i));
			}
		}
	}
}
