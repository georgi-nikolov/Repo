
public class Retake4 {

	public static void main(String[] args) {
		int start = 10;
		printNumbersInReverse(start);
	}
	static int printNumbersInReverse(int start){
		if(start == 0)
			return start;
		System.out.print(start + " ");
		return printNumbersInReverse(start-1);
	}
}
