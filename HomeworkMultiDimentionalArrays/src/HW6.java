
public class HW6 {

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
		
		for (int i = 1; i < masiv.length; i+=2) {
			for (int j = 0; j < masiv[i].length; j++) {
				sum = sum + masiv[i][j];
				if(j==masiv[i].length-1)
				System.out.print(masiv[i][j] + " / ");
				else
				System.out.print(masiv[i][j] + ", ");
			}
			System.out.println("The sum of row " + (i+1) + " is: " + sum);
			bigSum = bigSum + sum;
			sum = 0;
		}
		System.out.println("The sum total sum is: " + bigSum);
		
	}
}
