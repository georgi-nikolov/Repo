
public class HW4 {

public static void main(String[] args) {
		
		int temp = 0;
		int[][] masiv = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}};
		int[][] masivCopy = new int[6][6];
		
		for (int j = 0; j <masiv.length ; j++) {
			for (int i = masiv[j].length-1; i >=0; i--) {
				masivCopy[j][temp] = masiv[i][j];
				temp++;
			}
			temp = 0;
		}
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				if(j==masivCopy[i].length-1)
					System.out.print(masivCopy[i][j]);
				else
					System.out.print(masivCopy[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
