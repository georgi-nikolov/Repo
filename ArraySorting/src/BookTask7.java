import java.util.Arrays;
import java.util.Scanner;
public class BookTask7 {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int[] arr = input();
		System.out.println("Enter somerthing");
		String something = userInput.nextLine();
		System.out.println(something);
		String[] values = something.split("");
		arr = fillArr(arr,values);
	System.out.println(Arrays.toString(arr));
		
	}
	static int[] input(){
		Scanner userInput = new Scanner(System.in);
		int input = 0;
		do{
			System.out.println("Enter a number: ");
			while(!userInput.hasNextInt()){
				userInput.next();
			}
			input = userInput.nextInt();
		}
		while(input<0);
		int[] in = new int[input];
		return in;
	}
	static int[] fillArr(int[] arr, String[] values){
		
		
		    int answer = 0, factor = 1;
		    for(int j=0; j<values.length; j++){
		    	for (int i = values[j].length()-1; i >= 0; i--) {
		    		answer += (values[j].charAt(i) - '0') * factor;
		    		factor *= 10;
		    	}
		    	arr[j] = answer;
		    }
		    return arr;
		}
	}

//print the most common element using counting sort