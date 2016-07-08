import java.util.Scanner;
public class Problem21 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number of the card(1-51): ");
		int card = userInput.nextInt();
		
		if (card>0 && card<=51){
			for (int x=card; x<=52; x++){
				int suit = x%4;
				
				switch (x){
					case 37: 
					case 38:
					case 39: 
					case 40:
						System.out.print("Jack ");
						break;
					case 41: 
					case 42:
					case 43: 
					case 44:
						System.out.print("Queen ");
						break;
					case 45: 
					case 46:
					case 47:
					case 48:
						System.out.print("King ");
						break;
					case 49: 
					case 50:
					case 51: 
					case 52:
						System.out.print("Ace ");
						break;
					default:
						if (x%4==0){
							System.out.print((x/4)+1 + " ");
						}
						else{
							System.out.print((x/4)+2 + " ");
						}
						break;
				}
				switch (suit){
				case 1:
					System.out.print("of Clubs; ");
					break;
				case 2:
					System.out.print("of Diamonds; ");
					break;
				case 3:
					System.out.print("of Hearts; ");
					break;
				case 0:
					System.out.print("of Spades; ");
					break;
				}
			}
		}
		else{
			System.out.println("Invalid input.");
		}
	}
}
