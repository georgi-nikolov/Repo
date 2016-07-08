
public class Problem23 {

	public static void main(String[] args) {
		
		int a =1;
		int restart =1;
		int iteration = 1;
		int temp =9;
		int b = 1;
		int c = 1;
		while (a<=9){
			while (iteration<=temp){
				System.out.print(a + "*" + b + ";");
				iteration++;
				b++;
			}
			c++;
			b=c;
			temp--;
			iteration = restart;
			System.out.println();
			a++;
		}
	}
}
