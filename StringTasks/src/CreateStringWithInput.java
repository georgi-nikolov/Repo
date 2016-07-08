import java.util.Scanner;
public class CreateStringWithInput {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = userInput.nextInt();
		String result = "0";
		int m = 5;
		
		for(int i=1; i!=num+1; i++){
		result = result + i;
		}
		System.out.println(result);
		System.out.println(result.charAt(5));
		System.out.println();
		System.out.println(m);
	}
	
}
