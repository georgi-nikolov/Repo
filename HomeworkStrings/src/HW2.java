import java.util.Scanner;

public class HW2 {
	private static Scanner userInput;
	
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String one = input();
		String two = input();
		String tempTwo = two;
		String tempOne = one;
		one = replaceFirstFiveChars(two,one);
		tempTwo = replaceFirstFiveChars(tempOne,tempTwo);
		String max = maxLength(one,two);
		print(max,one,tempTwo);
		
		
	}
	static String input(){
		String input;
		do{
			System.out.println("Enter a word: ");
			input = userInput.nextLine();
		}
		while(input.length()<10 && input.length()>20);
		return input;
	}
	
	static String replaceFirstFiveChars(String one, String two){
		String tempOne = one.substring(0,5);
		String tempTwo = two.substring(5);
		two = tempOne+tempTwo ;
		return two;
	}
	
	static String maxLength(String one, String two){
		String max = "They are equal in lenght";
		if(one.length()>two.length()){
			max = one;
		}
		else{
			max = two;
		}
		return max;
	}
	static void print(String one, String two, String three){
		System.out.println("The max length is: " + one.length());
		System.out.println(two);
		System.out.println(three);
	}
}
