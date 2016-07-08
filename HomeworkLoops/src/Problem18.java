import java.util.Scanner;
public class Problem18 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = userInput.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = userInput.nextInt();
		
		for (int x=1; x<=a; x++){
			for (int y=1; y<=b; y++){
				System.out.println(x + "*" + y + "=" + x*y);
			}
		}
	}	
}
	
