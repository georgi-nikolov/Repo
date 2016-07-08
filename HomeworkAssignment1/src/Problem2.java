import java.util.Scanner;
public class Problem2 {

	public static void main(String[] agrs){
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the first whole number: ");
	int numOne = userInput.nextInt();
	
	System.out.println("Enter the second whole number: ");
	int numTwo = userInput.nextInt();
	int sum = numOne + numTwo;
	int diff = numOne - numTwo;
	int mult = numOne * numTwo;
	int mod = numOne % numTwo;
	int dev = numOne / numTwo;
	System.out.println("The sum of the two is: " + sum);
	System.out.println("The difference between the two is: " + diff);
	System.out.println("The result of multiplication is: " + mult);
	System.out.println("The modulus is: " + mod);
	System.out.println("The result of the devision is: " + dev);
	
	
	System.out.println("Enter the first real number: ");
	double nummOne = userInput.nextDouble();
	
	System.out.println("Enter the second real number: ");
	double nummTwo = userInput.nextDouble();
	double sum1 = nummOne + nummTwo;
	double diff1 = nummOne - nummTwo;
	double mult1 = nummOne * nummTwo;
	double mod1 = nummOne % nummTwo;
	double dev1 = nummOne / nummTwo;
	System.out.println("The sum of the two is: " + sum1);
	System.out.println("The difference between the two is: " + diff1);
	System.out.println("The result of multiplication is: " + mult1);
	System.out.println("The modulus is: " + mod1);
	System.out.println("The result of the devision is: " + dev1);
	
	}
}
