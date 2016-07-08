import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int rows = userInput.nextInt();
		int num = rows-1;
		
		if (rows%2==1){
			for (int x=1; x<=rows; x++){
				for (int y=1; y<=rows; y++){
					System.out.print(num);
			}
			System.out.println();
			num+=2;
			}
		}
		else{
			for (int x=1; x<=rows; x++){
				for (int y=1; y<=rows; y++){
					System.out.print(num);
				}
				System.out.println();
				num+=2;
			}
		}
	}	
}


