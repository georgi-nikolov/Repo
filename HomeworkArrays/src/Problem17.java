import java.util.Scanner;
public class Problem17 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
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
		int[] arrayOne = new int[num];
		boolean zig = true;
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1)+ ": ");
			arrayOne[i] = userInput.nextInt();
		}
		for (int i=0; i<arrayOne.length; i++){
			if (i%2==0 && i+1<arrayOne.length){
				if (arrayOne[i]>arrayOne[i+1]){
					zig = false;
				}
			}
			if (i%2==1 && i+1<arrayOne.length){
				if (arrayOne[i]<arrayOne[i+1]){
					zig = false;
				}
			}
		}
		if (zig == true){
			System.out.println("The condition is true");
		}
		else{
			System.out.println("The condition is false");
		}
	}
}
