//find extremium
import java.util.Scanner;
public class BookTask9 {
static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int[] masiv = input();
		int extr = findExtremium(masiv,0,masiv.length-1);
		System.out.println(extr);
	}
	static int findExtremium(int[] masiv, int left, int right){
		int mid = (left+right)/2;
		if(masiv[0]<masiv[1]){
			if(masiv[mid+1]>masiv[mid]){
				left = mid;
			}
			if(masiv[mid-1]>masiv[mid])
				right = mid;
			if(masiv[mid-1]<masiv[mid] && masiv[mid+1]<masiv[mid]){
				return masiv[mid];
			}
		}
		if(masiv[0]>masiv[1]){
			if(masiv[mid+1]<masiv[mid])
				left = mid;
			if(masiv[mid-1]<masiv[mid])
				right = mid;
			if(masiv[mid-1]>masiv[mid] && masiv[mid+1]>masiv[mid]){
				return masiv[mid];
			}
		}
		if(left>right){
			return -1;
		}
		return findExtremium(masiv,left,right);
	}
	static int[] input(){
		int cells;
		do{
			System.out.println("Enter the number of cells: ");
			while(!userInput.hasNextInt()){
				userInput.next();
			}
			cells = userInput.nextInt();
		}
		while(cells<0);
		int[] masiv = new int[cells];
		for (int i = 0; i < masiv.length; i++) {
			System.out.println("Enter the value for cell " + (i+1));
			while(!userInput.hasNextInt()){
				userInput.next();
			}
			masiv[i] = userInput.nextInt();
		}
		return masiv;
	}
}
