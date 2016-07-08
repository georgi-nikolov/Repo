import java.util.Scanner;
public class Task5 {
	private static Scanner userInput;
	
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int numOne;
		int numTwo;
		int digitsOne = 0;
		int digitsTwo = 0;
		int min;
		int counter = 0;
		do{
			System.out.println("Enter a number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			numOne = userInput.nextInt();
		}
		while(numOne<0);
		
		do{
			System.out.println("Enter a number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			numTwo = userInput.nextInt();
		}
		while(numTwo<0);
		
		for (int i=numOne; i!=0; i/=2){
			digitsOne++;
		}
		for (int i=numTwo; i!=0; i/=2){
			digitsTwo++;
		}
		int[] arrayOne = new int[digitsOne];
		int[] arrayTwo = new int[digitsTwo];
		
		for (int i=0; i<arrayOne.length; i++){
			if(numOne>0){
				arrayOne[i] = numOne%2;
			}
			numOne/=2;
		}
		
		for (int i=0; i<arrayTwo.length; i++){
			if(numTwo>0){
				arrayTwo[i] = numTwo%2;
			}
			numTwo/=2;
		}
		if(arrayOne.length<arrayTwo.length){
			min = arrayOne.length;
		}
			else if(arrayOne.length>arrayTwo.length){
				min = arrayTwo.length;
			}
		else
			min = arrayOne.length;
		
		for(int i=0; i<min; i++){
			if((arrayOne[i] ^ arrayTwo[i]) == 0)
				counter++;
		}
		System.out.print("The 1st number in binary: ");
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i] + ", ");
		}
		System.out.println();
		System.out.print("The 2nd number in binary: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + ", ");
		}
		System.out.println();
		if(counter == 1)
			System.out.println("One element is equal");
		else
		System.out.println(counter + " elements are equal");
	}
}
