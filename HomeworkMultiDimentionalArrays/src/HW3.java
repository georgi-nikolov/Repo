
public class HW3 {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 1;
		int[][] masiv = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}};
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				sum = sum + masiv[i][j];
				counter++;
			}
		}
		System.out.println("The sum of all the values is: " + sum);
		System.out.println("The average of all the numbers is: " + (sum/counter));
	}
}
