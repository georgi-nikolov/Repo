import java.util.Scanner;

public class HW4 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String name = input();
		String nameOne = getNameOne(name);
		String nameTwo = getNameTwo(name);
		print(getSum(nameOne,nameTwo));
	}
	static String input(){
		String input;
		String comma = ",";
		do{
			System.out.println("Enter 2 names devided with a comma: ");
			input = userInput.nextLine();
		}
		while(!input.contains(comma));
		return input;
	}
	static String getNameOne(String one){
		String nameOne;
		int counter = 0;
		for (int i = 0; i < one.length(); i++) {
			if(one.charAt(i)!= ','){
				counter++;
			}	
			else
				break;
		}
		nameOne = one.substring(0,counter);
		return nameOne;
	}
	
	static String getNameTwo(String one){
	
		String nameTwo;
		int counter = 0;
		for (int i = 0; i < one.length(); i++) {
			if(one.charAt(i)!= ','){
				counter++;
			}	
			else
				break;
		}
		nameTwo = one.substring(counter+1);
		return nameTwo;
	}
	static String getSum(String one, String two){
		int sumOne = 0;
		int sumTwo = 0;
		
		for (int i = 0; i < one.length(); i++) {
			sumOne = sumOne + (int)one.charAt(i);
		}
		for (int i = 0; i < two.length(); i++) {
			sumTwo = sumTwo + (int)two.charAt(i);
		}
		if(sumOne>sumTwo){
			return one;
		}
		else
		return two;
	}
	
	static void print(String one){
		System.out.println(one);
	}
	
}
