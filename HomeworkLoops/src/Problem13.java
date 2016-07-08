import java.util.Scanner;
public class Problem13 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number(2-27): ");
		int sum = userInput.nextInt();
		
		if (sum>=2 && sum<=27){
			for (int x=100; x<=999; x++){
				int a = x/100 %10;
				int b = x/10 %10;
				int c = x%10;
				if (a+b+c == sum)
					System.out.print(x +",");
			}
		}
		else
			System.out.println("The number is not in range.");
	}
}

