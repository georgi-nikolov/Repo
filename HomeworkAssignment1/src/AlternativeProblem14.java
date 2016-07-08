import java.util.Scanner;
public class AlternativeProblem14 {

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
		
		boolean isFirstLight = ((xOne ^ yOne) & 1) == 0;
		boolean isSecondLight = ((xTwo ^ yTwo) & 1) == 0;
		/*I did not come up with this. 
		 * I just found it being elegant and
		 * good practice for bit operators.
		 */
		if (isFirstLight == isSecondLight){
			System.out.println("They 2 possitions are the same color.");
		}
		else{
			System.out.println("The 2 possitions are not the same color.");
		}
		}
		}