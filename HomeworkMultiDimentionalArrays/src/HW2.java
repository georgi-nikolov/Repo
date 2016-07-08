
public class HW2 {

	public static void main(String[] args) {
		
		int[][] masiv = {{1,4,6,3},
						 {5,9,7,2},
						 {4,8,1,9},
						 {2,3,4,5}};
		
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv.length; j++){
				if(i==j){
					if(j==masiv.length-1){
						System.out.print(masiv[i][j]);
						System.out.println();
					}
					else{
						System.out.print(masiv[i][j] + ", ");
					}
				}
				
			}
		}
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv.length; j++) {
				if(i+j==masiv.length-1){
					if(i==masiv.length-1){
						System.out.print(masiv[i][j]);
					}
					else{
						System.out.print(masiv[i][j] + ", ");
					}
				}
			}
		}
	}
}



