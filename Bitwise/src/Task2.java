// turn 231 into 772
public class Task2 {

	public static void main(String[] args) {
		
		
		// 231/2 = 115		1
		// 115/2 = 57 		1
		// 57/2 = 28 		1
		// 28/2 = 14 		0
		// 14/2 = 7 		0
		// 7/2 = 3 			1
		// 3/2 = 1 			1
		// 1/2 = 0 			1
		
		//11100111
		
		// 772/2 = 386 		0
		// 386/2 = 193 		0
		// 193/2 = 96		1
		// 96/2 = 48 		0
		// 48/2	= 24		0
		// 24/2 = 12 		0
		// 12/2 = 6 		0
		// 6/2 = 3			0
		// 3/2 = 1			1
		// 1/2 = 0 			1
		
		//1110011100
		//1100000100
		
		int input = 231;
		input = input << 2;
		//set a bit  x |= (1 << y) | (1 << z);
		//unset a bit x &= ~((1 << x) | (1 << y));
		input &= ~((1 << 3) | (1 << 4) | (1<<7));
		System.out.println(input);
		
	}
}
