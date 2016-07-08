import java.util.Scanner;
public class Problem15 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter the number of cells: ");
			while (!userInput.hasNextInt()){
				userInput.next();
				System.out.print("Please enter a whole number: ");
			}
			num = userInput.nextInt();
		}
		while(num <= 0);
		float[] arrayOne = new float[num];
		float[] arrayResult = new float[3];
		
		for(int i=0; i<arrayOne.length; i++){
			System.out.println("Enter a value for cell " + (i+1) + ": ");
			arrayOne[i] = userInput.nextFloat();
		}
		for (int i=0; i<arrayOne.length; i++){
			if(arrayOne[i]<0){
				arrayOne[i] = arrayOne[i]*-1;
			}
		}
		for (int i=0; i<arrayOne.length; i++){
			 if (arrayOne[i] > arrayResult[0])
			    {
				 arrayResult[2] = arrayResult[1];
				 arrayResult[1] = arrayResult[0];
				 arrayResult[0] = arrayOne[i];
			    }
			    else if (arrayOne[i] > arrayResult[1])
			    {
			    	arrayResult[2] = arrayResult[1];
			    	arrayResult[1] = arrayOne[i];
			    }
			    else if (arrayOne[i] > arrayResult[2])
			    {
			    	arrayResult[2] = arrayOne[i];
			    } 
		}
		for (int i=0; i<arrayResult.length; i++){
			System.out.print(arrayResult[i] + ", ");
		}
	}
}
