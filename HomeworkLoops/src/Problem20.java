public class Problem20 {

	public static void main(String[] args) {
		int rows = 0;
		int position = 0;
		int interationTwo = 10;
		int result =1;
		int restart = 1;
		int rowTwo = 0;
		
		for (rows=1; rows<=10; rows++){
			for (position=1; position<=interationTwo; position++){
				if (result == 10){
					System.out.print(0);
				}
				else{
					System.out.print(result);
				}
				result++;
			}
			if (rows > 1 && rows<=10){
				for (int x=1; x<=rowTwo; x++){
					System.out.print(x);	
				}
			}
			System.out.println();
			interationTwo--;
			restart++;
			result = restart;
			rowTwo++;
		}
	}
}
