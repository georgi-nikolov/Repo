
public class Task7 {

	public static void main(String[] args) {
		
		double[][] matrix = {{1.0,1.1,1.2},
							 {2.0,2.1,2.2},
					   	     {3.0,3.1,3.2}};
			
		String s2 = new String();
		int ctr = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				s2 = s2.concat(Double.toString(matrix[i][j]));
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(s2.substring(ctr, ctr+3)+ " ");
				ctr+=3;
			}
			System.out.println();
		}
	}
}
