import java.util.Scanner;
public class HW5 {
	private static Scanner userInput;
	
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		String wordOne = input();
		String wordTwo = input();
		if(doTheyHaveSameChar(wordOne,wordTwo)){
			int[] masiv = getSameCharIndexes(wordOne,wordTwo);
			printResult(masiv,wordOne,wordTwo);
		}
		else
			System.out.println("There are no matches.");
	}
	static String input(){
		System.out.println("Enter a word: ");
		String one = userInput.nextLine();
		return one;
	}
	
	static boolean doTheyHaveSameChar(String one, String two){
		boolean sameChar = false;
		for (int i = 0; i < one.length(); i++) {
			for (int j = 0; j < two.length(); j++) {
				if(one.charAt(i) == two.charAt(j)){
					sameChar = true;
				}
			}
		}
		return sameChar;
	}
	static int[] getSameCharIndexes(String one, String two){
		int[] resultIndex = new int[2];
		loop:
		for(int i=0; i<one.length(); i++){
			for (int j=0; j<two.length(); j++) {
				if(one.charAt(i) == two.charAt(j)){
					resultIndex[0] = i;
					resultIndex[1] = j;
					break loop;
				}
			}	
		}
		return resultIndex;
	}
	
	static void printResult(int[] masiv, String one, String two){
		for (int i = 0; i < two.length(); i++) {
				if((i != masiv[1]) && (masiv[0]>0)){
					for (int j = 0; j < masiv[0]; j++) {
						System.out.print(" ");
					}
				}
			if(i == masiv[1])
				System.out.print(one);
			else
				System.out.print(two.charAt(i));
			System.out.println();
		}
	}
}
