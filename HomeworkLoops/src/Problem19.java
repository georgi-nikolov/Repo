import java.util.Scanner;
public class Problem19 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a 2 digit number: ");
		if (userInput.hasNextInt()){
			int a = userInput.nextInt();
			if (a>=10 || a<100){
				int temp = 0;
				for (int x=a; x>1;x=temp){
					if(x%2==0){
						temp = x/2;
						System.out.print(temp + ",");
					}
					else{
						temp = (3*x)+1;
						System.out.print(temp + ",");
				}	
				}	
			}
			else{
				System.out.println("The number does not have 2 digits!");
			}	
		}
		else{
			System.out.println("That is not a number!");
		}
	}
}
