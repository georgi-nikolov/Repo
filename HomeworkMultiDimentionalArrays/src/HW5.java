
public class HW5 {

	public static void main(String[] args) {
		int sumRow = 0;
		int maxSumRow = 0;
		int sumCells = 0;
		int maxSumCells = 0;
		int counter = 0;
		
		int[][] masiv = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}};
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				sumCells = sumCells + masiv[i][j];
			}
			counter++;
			if(sumCells>maxSumCells){
				maxSumCells = sumCells;
			}
			sumCells = 0;
		}
		
		for (int j = 0; j <counter-1 ; j++) {
			for (int i = counter-1; i >=0; i--) {
				sumRow = sumRow + masiv[i][j];
			}
			if(sumRow>maxSumRow){
				maxSumRow = sumRow;
			}
			sumRow = 0;
		}
		System.out.println("The max sum of values from a given row is: " + (maxSumCells));
		System.out.println("The max sum of values from a given column is: " + maxSumRow);
		System.out.print("The maximum sum from a given row is ");
		if(maxSumCells>maxSumRow)
			System.out.print("> than");
		else if (maxSumCells<maxSumRow)
			System.out.print("< than");
		else
			System.out.println("= to");
		System.out.print(" the maximum sum from a given column");
	}
}
