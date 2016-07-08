//turdno mi e da razbera spored postavenoto uslovie
//dali da polzvam userInput ili ne
//taka kakto go razbrah masiva e daden i prosto go prepisah ot primera
public class Problem14 {

	public static void main(String[] args) {
		int counter;
		double[] arrayOne = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};
		for(counter=0; counter<arrayOne.length; counter++){
		}
		double[] arrayTwo = new double[counter];
		int temp = 0;

		for(int i=0; i<arrayTwo.length; i++){
			if (arrayOne[i]>=-2.99 && arrayOne[i]<=2.99){
				arrayTwo[temp] = arrayOne[i];
				temp++;
			}
		}
		for (int i=0; i<temp; i++){
			System.out.print(arrayTwo[i] + ", ");
		}
	}
}
