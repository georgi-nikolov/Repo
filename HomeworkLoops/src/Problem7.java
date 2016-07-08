import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int i = userInput.nextInt();
		int temp = 3;
		
		for (int y =1; y<=i; y++){
			System.out.print(temp + ",");
			temp+=3;
		}	
	}
}
		
	

