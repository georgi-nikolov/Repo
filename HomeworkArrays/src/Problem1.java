import java.util.Scanner;
public class Problem1 {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int temp = 0;
		int num;
		
		do{
			System.out.println("Enter the number of cells: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			num = userInput.nextInt();
		}
		while(num <= 0);
		
		int[] masiv = new int[num];
		int[] temporary = new int[num];
		
		for (int i=0; i<masiv.length; i++){
			System.out.println("Enter the number for cell " + (i+1));
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			masiv[i] = userInput.nextInt();
		}
		for (int i=0; i<masiv.length; i++){
			if (masiv[i]%3==0){
				temporary[temp] = masiv[i];
				temp++;
			}
		}
		int min = temporary[0];
		for (int x=0; x<temp; x++){
			if (temporary[x]<min){
				min = temporary[x];
			}
		}
		System.out.println("The lowest number devisible by 3 is " + min);
	}
}