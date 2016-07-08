import java.util.Scanner;
public class BookTask8 {
	static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int[] masiv = input();
		for (int i = 0; i < masiv.length; i++) {
			System.out.print(masiv[i] + " ");
		}
		System.out.println();
		checkIfSorted(masiv);
	}
	static void checkIfSorted(int[] masiv){
		boolean sorted = true;
		for (int i = 0; i < masiv.length-1; i++) {
			if(masiv[i]>masiv[i+1]){
				sorted = false;
				System.out.println(masiv[i] + " > " + masiv[i+1] );
			}
		}
		
		if(sorted)
			System.out.println("The array is sorted.");
		else
			System.out.println("The array is not sorted.");
	}
	static int[] input(){
		int cells = 0;
		do{
		System.out.print("Enter the number of cells: ");
		while(!userInput.hasNextInt()){
			userInput.next();
			System.out.println("Enter a positive real number: ");
		}
		cells = userInput.nextInt();
		}
		while(cells<0);
		int[] masiv = new int[cells];
		for (int i = 0; i < masiv.length; i++) {
			do{
				System.out.println("Enter the value for cell " + (i+1));
				
				while(!userInput.hasNextInt()){
					userInput.next();
					System.out.println("Enter a positive real number: ");
				}
				masiv[i] = userInput.nextInt();
				}
				while(masiv[i]<0);
		}
		return masiv;
	}
}
