import java.util.Scanner;
public class BookTask1 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int rows = input();
		int colls = input();
		int[][] arr = fillArray(rows,colls);
		int x = input();
		int[] helper  = new int[2];
		for (int i = 0; i < arr.length; i++) {
			helper = binarySearch(arr,x,0,arr[i].length-1,i,helper);
		}
		if(helper[1]== -1){
			System.out.println();
		}
		
	}
	static int input(){
		int input = 0;
		do{
			System.out.println("Enter a number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
			}
			input = userInput.nextInt();
		}
		while(input<0);
		return input;
	}
	static int[][] fillArray(int rows, int colls){
		int[][] arr = new int[rows][colls];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter a value for row " + (i+1) + " cell " + (j+1));
				arr[i][j] = userInput.nextInt();
			}
		}
		return arr;
	}
	static int[] binarySearch(int[][] arr, int x, int left, int right,int counter, int[] helper){
		int mid = left+right/2;
		
		if(x == arr[counter][mid]){
			helper[0] = counter;
			helper[1] = mid;
			return helper;
		}
		if(x>arr[counter][mid]){
			left = mid+1;
		}
		if(x<arr[counter][mid]){
			right = mid-1;
		}
		if(left>right){
			helper[1] = -1;
		}
		return binarySearch(arr,x,left,right,counter,helper);
	}
}
//binary search an element with input in a 2d array