import java.util.Scanner;
public class Task11 {
	private static Scanner userInput;
	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		int rows;
		int cells;
		
		do{
			System.out.println("Enter the number of rows: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			rows = userInput.nextInt();
		}
		while(rows<0);
		
		do{
			System.out.println("Enter the number of cells: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			cells = userInput.nextInt();
		}
		while(cells<0);
		
		int[][] masiv = new int[rows][cells];
		 for(int i = 0; i < 3; i++){
			    for(int j = 0; j < 3; j++){
			        masiv[i][j] = 0;
			    }
			 }
		
		masiv[0][0] = 1;
		for(int i = 0; i < rows; i++){
		    if(i != 0){
		    	masiv[i][0] = masiv[i-1][1]+1;
		    	} 
		    for(int j = 1; j < cells; j++){
		        if(i == 0){
		        	masiv[i][j] = masiv[i][j-1]+j;
		        }else{
		            if(i == rows-1 && j == cells -1){
		               // This is only a check for the last element
		            	masiv[i][j] = masiv[i][j-1]+1;
		                break;  
		            } 
		            masiv[i][j] = ((j+1) != (rows)) ? masiv[i-1][j+1] +1: masiv[i][j-1]+2;
		        }
		    }
		}
		
		for(int i = 0; i < rows; i++){
		     for(int j = 0; j < cells; j++){
		        System.out.print(masiv[i][j] + ", ");
		     }
		     System.out.println("");
		  }
	}
}
