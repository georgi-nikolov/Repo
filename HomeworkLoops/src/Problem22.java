import java.util.Scanner;
public class Problem22 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number (1-999): ");
		int num = userInput.nextInt();
		if (num>0 && num<=999){
			int temp = num;
			for (int x=1; x<=10;){
				if (temp%2==0 || temp%3==0 || temp%5==0){
					System.out.print(x + ":" + temp + "; ");
					temp++;
					x++;
				}
				else{
					temp++;
				}
			}
		}
		else{
			System.out.println("The number is not in range.");
		}
	}
}
