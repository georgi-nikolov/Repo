import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the time: ");
		int time = userInput.nextInt();
		//what is the purpose of this variable?
		System.out.println("Enter the value for money: ");
		double money = userInput.nextDouble();
		
		System.out.println("Are you healthy (true, false): ");
		boolean health = userInput.nextBoolean();
		
		if (health == false){
			System.out.println("I am sick and I will not go out.");
			}
		if (health == false && money <= 0){
			System.out.println("I will stay home and drink tea.");
			}
		if (health == false && money > 0){
			System.out.println("I will buy medication.");
			}
		if (health == true && money > 10){
			System.out.println("I will go to the movies.");
			}
		if (health == true && money < 10){
			System.out.println("I will go to the cafe with friends.");
			}
		}
		}