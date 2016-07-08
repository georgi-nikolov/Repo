
public class HW7 {

	public static void main(String[] args) {
		
		int sum = 0;
		int bigSum = 0;
		int[][] masiv = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}};
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv.length; j++) {
				if((i+j)%2==0){
					sum = sum + masiv[i][j];
					System.out.print(masiv[i][j] + ", ");
				}
			}
			System.out.print("The sum for row " + (i+1) + " is: " + sum);
			System.out.println();
			bigSum = bigSum + sum;
			sum = 0;
		}
		System.out.println("The total sum is: " + bigSum);
		
	}
}
