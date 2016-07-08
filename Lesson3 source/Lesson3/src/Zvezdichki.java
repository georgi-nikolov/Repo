
public class Zvezdichki {

	public static void main(String[] args) {
		
		int rows = 24;
		int stars = 1;
		
		for(int row = 1; row<=rows; row++){
			
			for(int spaces = 1; spaces <=rows-row; spaces++){
				System.out.print(" ");
			}
			
			for(int x = 1; x<=stars; x++){
				System.out.print("*");
			}
			System.out.println();
			stars+=2;
			
		}
		
		
	}
}
