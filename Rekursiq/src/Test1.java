import java.util.Scanner;
public class Test1 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int counter = 0;
		String one = "heads";
		String two = "tails";
		
		do{
			System.out.println("Enter heads or tails: ");
			String temp = userInput.nextLine();
			if(temp.equalsIgnoreCase(one)){
				counter++;
				if(counter == 5){
					System.out.println("5 heads");
					break;
				}
			}
			else if(temp.equalsIgnoreCase(two)){
				counter = 0;
			}
			else
				System.out.println("Invalid input.");
		}
		while(true);
	}
}
