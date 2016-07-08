import java.util.Scanner;
public class Problem16 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n = userInput.nextInt();
		
		System.out.println("Enter the second number: ");
		int m = userInput.nextInt();
		
		if (n>m){
			for (int x=n; x>=m; x--){
				if (x%50==0){
					System.out.print(x + ",");
				}
			}
		}
		else if (m>n){
			for (int x=m; x>=n; x--){
				if (x%50==0){
					System.out.print(x + ",");
				}
			}
		}
		else{
			System.out.println("The numbers are eaqual.");
		}
	}
}
