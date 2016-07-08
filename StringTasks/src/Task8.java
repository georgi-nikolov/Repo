import java.util.Scanner;
public class Task8 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String input;
		String output = "0";
		String temp;
		int ctr = 0;
		for(int i=0; i<999; i++){
			input = input();
			if(finalCheck(input,i)){
				break;
			}
			//if(!checkInput(input)){
				int counter = countPresses(input);
				temp = getChar(input,counter);
				output = resultStr(temp);
			//}
		}
		System.out.println(output);
		
	}
	static String resultStr(String temp){
		String resultStr = ""; 
		resultStr.concat(temp);
		return resultStr;
	}
	static String getChar(String input, int counter){
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String temp;
		String charec;
		int nqkyvInt = 0;
		try{
			nqkyvInt = Integer.parseInt(input);
		}
		catch (NumberFormatException nfe){};
		System.out.println(nqkyvInt);
		System.out.println(counter);
		switch (nqkyvInt){
		case 2:
			temp = alphabet.substring(0,2);
			charec = temp.substring(counter-1,counter);
		case 3:
			temp = alphabet.substring(3,5);
			charec = temp.substring(counter, counter);
		case 4:
			temp = alphabet.substring(6,8);
			charec = temp.substring(counter, counter);
		case 5:
			temp = alphabet.substring(9,11);
			charec = temp.substring(counter, counter);
		case 6:
			temp = alphabet.substring(12,14);
			charec = temp.substring(counter, counter);
		case 7:
			temp = alphabet.substring(15,18);
			charec = temp.substring(counter, counter);
		case 8:
			temp = alphabet.substring(19,21);
			charec = temp.substring(counter, counter);
		case 9:
			temp = alphabet.substring(22,25);
			charec = temp.substring(counter, counter);
		default:
			charec = "0";
		}
		System.out.println(charec);
		
		return charec;
	}
	static int countPresses(String input){
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			if((counter>4 && (input=="7")) || (counter>4 && (input=="9"))){
				counter = 0;
			}
			else if(counter>3){
				counter=3;
			}
			else{
			counter++;
			}
		}
		return counter;
	}
	static String input(){
		System.out.println("Press num x times to get char");
		String input = userInput.nextLine();
		return input;
	}
	static boolean finalCheck(String input, int ctr){
		boolean n = false;
		//if((input == "n") && (ctr%2==0)){
		if(input.charAt(0) == 'n'){
			n = true;
		}
		return n;
	}
	static boolean checkInput(String input){
		boolean y = false;
		if(input == "y")
			y = true;
		return y;
	}
}
