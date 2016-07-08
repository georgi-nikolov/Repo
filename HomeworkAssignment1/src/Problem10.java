import java.util.Scanner;
public class Problem10 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the volume of the tank: ");
		int volume = userInput.nextInt();
		int bucketOne = 2;
		int bucketTwo = 3;
		if (volume >= 10 && volume <= 9999){
			int bucketNum = volume / (bucketOne + bucketTwo);
			int remainder = volume % (bucketOne + bucketTwo);
			if (remainder < 2 && remainder != 0){
				System.out.println(bucketNum + " times 2");
				System.out.println(bucketNum + " times 3");
				System.out.println("1 is left.");
				}
			if (remainder == 2){
			System.out.println(bucketNum + " times 2");
			System.out.println(bucketNum + " times 3");
			System.out.println("One bucket of 2 in addition.");
			}
			if (remainder == 3){
				System.out.println(bucketNum + " times 2");
				System.out.println(bucketNum + " times 3");
				System.out.println("One bucket of 3 in addition.");
				}
			if (remainder == 4){
				System.out.println(bucketNum + " times 2");
				System.out.println(bucketNum + " times 3");
				System.out.println("One bucket of 3 in addition and 1 remaining.");
			}
			if (remainder == 0){
				System.out.println(bucketNum + " times 2");
				System.out.println(bucketNum + " times 3");
			}
			}
		else{
			System.out.println("Invalid data entered.");
		}
		}
		}	

