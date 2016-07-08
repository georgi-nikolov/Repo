import java.util.Scanner;
public class BinarySearchBot {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int[] masiv = new int[99];
		for (int i = 0; i < masiv.length; i++) {
			masiv[i] = i+1;
		}
		int input = input(masiv[(masiv.length)/2]);
		System.out.println(binarySearch(masiv,input,0,masiv.length-1));
		
	}
	static int binarySearch(int[] arr, int input, int left, int right){
		int mid  = (left+right)/2;
		if(input == 0)
			return arr[mid-1];
		if(input == 1)
			right = mid-1;
		if(input == 2)
			left = mid+1;
		mid  = (left+right)/2;
		return binarySearch(arr,input(mid),left,right);
	}
	static int input(int mid){
		int input = 0;
		do{
			System.out.println("Is the number > or < or = than " + mid);
			while(!userInput.hasNextInt()){
				userInput.next();
			}
			input = userInput.nextInt();
		}
		while(!(input>-1 && input<3));
		return input;
	}
}
