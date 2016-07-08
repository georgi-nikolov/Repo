import java.util.Scanner;
public class Problem8 {
// this does not work quite well but i did not have enough time to sort it out
// it always displays the correct value but the frequency of that value is where it fails
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter the number of cells: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			num = userInput.nextInt();
		}
		while(num <= 0);
		
		int[] arrayOne = new int[num];
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter the value for cell " + (i+1) + ": ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			arrayOne[i] = userInput.nextInt();
		}
		int counter = 1;
		int max = 0;
		int maxNum = arrayOne[0];
		
		for (int i=1; i<arrayOne.length; i++){
			if (arrayOne[i] != arrayOne[i-1]){
				if (counter>max){
					maxNum = arrayOne[i-1];
					max = counter;
				}
				if(i!=arrayOne.length-1)
				counter = 1;
			}
			else{
			counter++;
			}
		}
		if (counter>max){
			maxNum = arrayOne[arrayOne.length-1];
			max = counter;
		}
		for (int i=0; i<counter; i++){
			System.out.print(maxNum + ", ");
		}
		System.out.println();
		System.out.println(counter);
	}
}
