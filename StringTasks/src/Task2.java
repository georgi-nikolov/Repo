import java.util.Scanner;
public class Task2 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String name = input();
		int counter = wordCount(name);
		String[] names = name.split(" ");
		for (int i = 0; i < counter; i++) {
			System.out.print(names[i].charAt(0) + " ");
		}
	}
	static String input(){
		String name;
		System.out.println("Enter your name: ");
		name = userInput.nextLine();
		return name;
	}
	static int wordCount(String name){
		int counter = 1;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)== ' ')
				counter++;
		}
		return counter;
	}

}
