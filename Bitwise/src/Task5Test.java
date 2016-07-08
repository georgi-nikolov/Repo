import java.util.Scanner;
public class Task5Test {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int day;
		int month;
		int year;
		
		do{
			System.out.println("Enter a day: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			day = userInput.nextInt();
		}
		while(day<0);
		
		do{
			System.out.println("Enter a month: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			month = userInput.nextInt();
		}
		while(month<0);
		
		do{
			System.out.println("Enter the year: ");
			while(!userInput.hasNextInt()){
				userInput.next();
				System.out.println("Please enter a whole number: ");
			}
			year = userInput.nextInt();
		}
		while(year<0);
		
		String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
		int[] monthArrayNum = new int[31];
		
		for (int i=0; i<monthArrayNum.length; i++){
			monthArrayNum[i] = i+1;
		}
		
		if((year%4==0) &&(year%400==0) && (month==2) && (day==28)){
			System.out.println(monthArrayNum[day] + " " + monthArray[month-1] + " " + year);
		}
		else if(month==2 && day==28){
			System.out.println();
		}
		for (int i = 0; i < monthArrayNum.length; i++) {
			System.out.print(monthArrayNum[i] + ", ");
		}
	}
}
