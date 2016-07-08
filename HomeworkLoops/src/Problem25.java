import java.util.Scanner;
public class Problem25 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
					
		System.out.println("Enter the number: ");
		int a = userInput.nextInt();
		int sum = 1;
		int iterration = 1;
		int temp = 0;
		
			do{
				sum = sum*(temp+1);
				iterration++;
				temp++;
				}
				while (iterration<=a);
				System.out.println(sum);
	}
}
