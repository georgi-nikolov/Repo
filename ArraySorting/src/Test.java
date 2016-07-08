import java.util.Scanner;
public class Test {
	static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Enter the number of cells: ");
		int cells = userInput.nextInt();
		int[] masiv = new int[cells];
		int max = masiv[0];
		for (int i = 0; i < masiv.length; i++) {
			System.out.println("Enter the value for cell " + (i+1));
			masiv[i] = userInput.nextInt();
		}
		for (int i = 0; i < masiv.length; i++) {
			if(masiv[i]>max)
				max = masiv[i];
		}
		int[] helper = new int[max+1];
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < helper.length; j++) {
				if(masiv[i] == j)
					helper[j]++;
			}
		}
		for (int i = 0; i < helper.length; i++) {
			System.out.print(helper[i] + " ");
		}
		int result = helper[0];
		int indexOfResult = 0;
		for (int i = 1; i < helper.length; i++) {
			if(helper[i]>result){
				result = helper[i];
				indexOfResult = i;
			}
		}
		System.out.println("The most common element is " + indexOfResult + " and it appears " + result + " times.");
	}
}
