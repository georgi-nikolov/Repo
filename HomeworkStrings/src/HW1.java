import java.util.Scanner;
public class HW1 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		String One = inputStrings();
		String Two = inputStrings();
		printUpperLowerCaseStringResult(One);
		printUpperLowerCaseStringResult(Two);
	}
	static String inputStrings(){
		String userInputOne;
		do{
			System.out.println("Enter some text: ");
			userInputOne = userInput.nextLine();
		}
		while(userInputOne.length()>40);
		
		return userInputOne;
	}
	
	static void printUpperLowerCaseStringResult(String userInputOne){
		System.out.println("The original is: " + userInputOne);
		System.out.println(userInputOne.toUpperCase());
		System.out.println(userInputOne.toLowerCase());
		System.out.println();
	}
	
}
