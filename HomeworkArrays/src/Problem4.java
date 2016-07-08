import java.util.Scanner;
public class Problem4 {
	
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
		int temp = arrayOne.length-1;
		
		boolean mirror = true;
		
		for (int i=0; i<arrayOne.length; i++){
			System.out.print("Enter the value for cell " + (i+1) + ": ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayOne[i] = userInput.nextInt();
		}
		
		for (int i=0; i<arrayOne.length; i++){
			if (temp - i == 1){
				break;
			}
			if (arrayOne[i] != arrayOne[temp]){
				mirror = false;
			}
			temp--;
		}
		if (mirror == true){
			System.out.println("This is a mirror array!");
		}
		else{
			System.out.println("This is not a mirror array!");
		}
	}
}
