import java.util.Scanner;
public class Besenica {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		char[] secret = {'m','a','r','i','h','u','a','n','a'};
		char[] screen ={'_','_','_','_','_','_','_','_','_'};
		int counter = 5;
		while(counter>0){
			print(screen);
			
			if(didUserWin(screen)){
				counter = restartCounter(counter);
				restartArray(counter,screen);
				if(counter==-1)
					break;
			}
			char x = input();
			
			if(doTheyMatch(x,secret)){
				screen = searchForMatch(x,screen,secret);
			}
			else{
				if(counter>1){
					System.out.println("This letter does not appear in the word.");
					counter--;
					System.out.println("You have " + counter + " tries left.\n");
				}
				else{
					printHanger(counter);
					counter = restartCounter(counter);
					restartArray(counter,screen);
				}
			}
		}
	}
	
	static char input(){
		System.out.println("Enter a character: ");
		char one;
		one = userInput.next().charAt(0);
		return one;
	}
	static boolean doTheyMatch(char one, char[] secret){
		boolean match = false;
		for(int i=0; i<secret.length; i++){
			if(one == secret[i]){
				match = true;
			}
		}
		return match;
	}
	static char[] searchForMatch(char one, char[] masiv, char[] secret){
		for(int i=0; i<secret.length; i++){
			if(one == secret[i]){
				masiv[i] = secret[i];
			}
		}
		return masiv;
	}
	
	static int restartCounter(int counter){
		if(counter>1)
			printWin(counter);
		System.out.println("Would you like to start a new game (y/n): ");
		char input = userInput.next().charAt(0);
		if(input == 'y'){
			counter = 5;
		}
		else{
			counter = -1;
			System.out.println();
			System.out.println("Game over.");
		}
		return counter;
	}
	static char[] restartArray(int counter, char[] one){
		if(counter>0){
			for (int i = 0; i < one.length; i++) {
				one[i] = '_';
			}
		}
		return one;
	}
	
	static boolean didUserWin(char[] one){
		boolean didTheyWin = true;
		char a = '_';
		for (int i = 0; i < one.length; i++) {
			if(one[i] == a)
				didTheyWin = false;
		}
		return didTheyWin;
	}
	
	static void printHanger(int a){
		System.out.println();
		System.out.println("Game over.");
		System.out.println(" ______");
		System.out.println(" |    |");
		System.out.println(" |    O");
		System.out.println(" |   /|"+"\\");
		System.out.println(" |   / "+"\\ ");
		System.out.println(" |");
	}
	static void printWin(int a){
		System.out.println();
		System.out.println("You got it!\n");
		System.out.println(("  ")+("\\")+("O/"));
		System.out.println("   |");
		System.out.println("  / " + ("\\"));
		System.out.println("********");
	}
	
	static void print(char[] one){
		for (int i = 0; i < one.length; i++) {
			System.out.print(one[i] + " ");
		}
		System.out.println();
	}
}
