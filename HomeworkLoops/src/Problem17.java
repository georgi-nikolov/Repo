import java.util.Scanner;
public class Problem17 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the side of the square(1-20): ");
		int side = userInput.nextInt();
		
		System.out.println("Enter the symbol for the inside: ");
		String inside = userInput.next();
		
		for (int row=1; row<=side; row++){
			for (int lenght=1; lenght<=side; lenght++){
				if ((row>1 && row<=side-1) && (lenght>1 && lenght<=side-1)){
					System.out.print(inside);
				}
				else{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
