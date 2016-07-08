import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		// infinite inputs
		// when AK or KA increment counter to three
		//else restart counter
		//show global counter at the end.
		int counter = 0;
		int cnr = 0;
		boolean flag = true;
		while(true){
			System.out.println("Enter the values: ");
			char one = userInput.next().charAt(0);
			char two = userInput.next().charAt(0);
			if(one!='2' && one!='3' && one!='4' && one!='5' && one!='6' && one!='7' && one!='8' && one!='9' && one!='A'
					&& one!='J' && one!='Q' && one!='K'){
				System.out.println("Invalid input");
				flag = false;
				continue;
			}
			if(two!='2' && two!='3' && two!='4' && two!='5' && two!='6' && two!='7' && two!='8' && two!='9' && two!='A'
					&& two!='J' && two!='Q' && two!='K'){
				System.out.println("Invalid input");
				flag = false;
				continue;
			}
			if(flag){
				counter++;
			}
			if((one == 'A' && two == 'K')||(two=='A' && one == 'K')){
				cnr++;
			}
			else{
				cnr=0;
			}
			if(cnr==3){
				System.out.println("Number of tries " + counter);
				break;
			}
			
		}
	}
}
