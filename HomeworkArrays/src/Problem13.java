import java.util.Scanner;
public class Problem13 {
// I though about playing around with a dynamic array
// but in the end I settled for this solution with a static array
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		long num;
		do{
			System.out.println("Enter a whole positive number: ");
			while (!userInput.hasNextLong()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			num = userInput.nextLong();
		}
		while(num <= 0);
		//the idea here is to save ram while allowing for a large user input
		
		byte[] arrayOne = new byte[64];
		int counter = 0;
		
		for (int i=arrayOne.length-1; i>=0; i--){
			if (num == 0){
				break;
			}
			arrayOne[i] = (byte) (num%2);
			num = num/2;
			counter++;
		}
		System.out.print("The number in binary is: ");
		for (int i=arrayOne.length - counter; i<arrayOne.length; i++){
			System.out.print(arrayOne[i]);
		}
	}
}
