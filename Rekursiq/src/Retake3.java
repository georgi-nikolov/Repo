
public class Retake3 {

	public static void main(String[] args) {
		int start = -10;
		printOddNumbers(start);
	}
	static int printOddNumbers(int start){
		if(start == 10)
			return start;
		if(start%2==0)
			return printOddNumbers(start+1);
		else{
			System.out.print(start + " ");
			return printOddNumbers(start+1);
		}	
	}
}
