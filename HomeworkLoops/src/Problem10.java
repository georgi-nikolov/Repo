import java.util.Scanner;
public class Problem10 {
	
	public static void main(String[] args) {
		
		Scanner userInput= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int temp;
		boolean isItPrime=true;
		
		int number=userInput.nextInt();
		for(int x=2;x<=number/2;x++){
			temp=number%x;
			if(temp==0) {
				isItPrime=false;
				break;
		   }
		}
		if(isItPrime)
		   System.out.println(number + " is Prime!");
		else
		   System.out.println(number + " is not Prime!");
	}
}
	
