
public class Retake1 {

	public static void main(String[] args) {
		int start = 1;
		printNumbers(start);
	}
	static int printNumbers(int start){
		if (start == 101)
			return start;
		System.out.println(start);
		return printNumbers(start+1);
		
	}
}
