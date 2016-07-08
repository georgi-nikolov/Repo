import java.util.Scanner;

public class SquareTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value for side");
		double side = sc.nextDouble();
				
		if(side>0){
			System.out.println("You have enterred a valid number");

			double size = side*side;
			System.out.println("The size of the square is ");
			System.out.println(size);
		}
		else{
			if(side == 0){
				System.out.println("Your side is zero. I`m confused");
			}
			else{
				System.out.println("Your side is negative. bla");
			}
		}
		
		
		
		
		
	}
}
