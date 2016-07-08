import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	int a = userInput.nextInt();
	
	System.out.println("Enter the second number: ");
	int b = userInput.nextInt();
	
	int sum = 0;
	
		for (int x=a; x<=b; x++){
			if (sum<=200){
				if (x%3==0){
					System.out.print("skip(" + x + "),");
					continue;
				}
				sum = sum + (x*x);
				System.out.print(x*x + ",");
			}
		else{
			System.out.println();
			System.out.println("The sum is more than 200.");
			break;
		}
		}
	}
}
