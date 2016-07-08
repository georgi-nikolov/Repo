import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int rows = userInput.nextInt();
		int stars =1;
		for (int row=1; row<=rows; row++){
			for (int spaces = 1; spaces <=rows-row; spaces++){
				System.out.print(" ");
				if (spaces == rows-row)
					System.out.print("*");
			}
			for (int x=2; x<=stars; x++){
				if (row < rows){
				System.out.print(" ");
				if (x == stars-1)
					System.out.print("*");
				}
			}
			if (row == rows)
				for (int i=1; i<=stars; i++)
				System.out.print("*");
			System.out.println();
			stars+=2;
			
		}
		
	   }
	}


