import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number (10-200); ");
		if (userInput.hasNextInt()){
		int a = userInput.nextInt();
		
			if (a>=10 && a<=200){
				for(int x=a; x>=1; x--){
					if (x%7==0){
						System.out.print(x + ",");
					}
				}
			}
			else{
				System.out.println("The number is not in range!");
			}
		}
		else{
			System.out.println("That is not a number!");
		}
	}
}
