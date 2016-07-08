
public class Problem12 {

	public static void main(String[] args) {
	
		for (int x = 100; x<=999; x++){
			int a = x/100 %10;
			int b = x/10 %10;
			int c = x%10;
			if (a==b || a==c || b==c){
				continue;
			}
		System.out.print(x + " ");
		}
	}
}
	

