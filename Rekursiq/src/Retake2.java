
public class Retake2 {

	public static void main(String[] args) {
		int start = -20;
		printNumbers(start);
	}
	static int printNumbers(int start){
		if(start==51)
			return start;
		System.out.print(start + " ");
		return printNumbers(start+1);
	}
}
