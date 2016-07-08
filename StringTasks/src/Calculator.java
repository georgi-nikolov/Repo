import java.util.Scanner;
public class Calculator {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		double inputOne = input();
		double inputTwo = input();
		char darkMagic = inputChar();
		double result = blackMagic(inputOne,inputTwo,darkMagic);
		System.out.println("The result is " + result);
	}
	static char inputChar(){
		System.out.println("Enter a char");
		char a = userInput.next().charAt(0);
		return a;
	}
	static double input(){
		System.out.println("Enter a number");
		double a = userInput.nextDouble();
		return a;
	}
	
	static double blackMagic(double input1, double input2, char magic){
		double result = 0;
		if (magic == '+'){
			result = input1+input2;
		}
		if (magic == '-'){
			result = input1-input2;
		}
		if (magic == '/'){
			result = input1/input2;
		}
		if (magic == '*'){
			result = input1*input2;
		}
		if (magic == '%'){
			result = input1%input2;
		}
		return result;
	}
}
