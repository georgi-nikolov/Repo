import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first x coordinate: ");
		int xOne = userInput.nextInt();

		System.out.println("Enter the first y coordinate: ");
		int yOne = userInput.nextInt();
		
		System.out.println("Enter the second x coordinate: ");
		int xTwo = userInput.nextInt();
		
		System.out.println("Enter the second y coordinate: ");
		int yTwo = userInput.nextInt();
		
		boolean locationOne;
		boolean locationTwo;
		
		if ((xOne %2 == 0 && yOne %2 == 0) || (xOne %2 == 1 && yOne %2 == 1)){
			locationOne = true;
		}
			else{
				locationOne = false;
			}	

		if ((xTwo %2 == 0 && yTwo %2 == 0) || (xTwo %2 == 1 && yTwo %2 == 1)){
			locationTwo = true;
		}
		else{
			locationTwo = false;
		}
		if (locationOne == locationTwo){
			System.out.println("The 2 locations are the same color");
		}
		else System.out.println("The 2 locations have different colors");
		}
		}