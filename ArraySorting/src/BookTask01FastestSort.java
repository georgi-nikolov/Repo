import java.util.Scanner;
public class BookTask01FastestSort {
	static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Enter the number of cells: ");
		int cells = userInput.nextInt();
		int zeros = 0, ones = 0;
		for (int i = 0; i < cells; i++) {
			System.out.println("Enter 0 or 1: ");
			int element = userInput.nextInt();
			if(element == 0)
				zeros++;
			else
				ones++;
		}
		for (int i = 0; i <cells-1; i++) {
			if(zeros>0){
				System.out.print(0);
				zeros--;
			}
			if(zeros==0){
				System.out.print(1);
			}
		}
	}
}
