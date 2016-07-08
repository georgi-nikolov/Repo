import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int rows = userInput.nextInt();
		int stars =1;
		for (int row=1; row<=rows; row++){
			for (int spaces = 1; spaces <=rows-row; spaces++){
				System.out.print(" ");
			}
			for (int x=1; x<=stars; x++){
				System.out.print("*");
			}
			System.out.println();
			stars+=2;
		}
	}
}
