import java.util.Scanner;
public class Problem12 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the day: ");
		int day = userInput.nextInt();
		
		System.out.println("Enter the month: ");
		int month = userInput.nextInt();
		
		System.out.println("Enter the year: ");
		int year = userInput.nextInt();
		boolean isItLeap;
		boolean isMonthLong;
		
		if (((year % 4 == 0) && (year %400 == 0)) && (month == 2 && day == 28)){
			System.out.println(++day);
			System.out.println(month);
			System.out.println(year);
		}
		else if (day == 29 && month == 2){
			day = 1;
			System.out.println(day);
			System.out.println(++month);
			System.out.println(year);
		}

	
	else{
		if (month == 2 && day == 28){
			day = 1;
			month = 3;
			System.out.println(day);
			System.out.println(month);
			System.out.println(year);
		}
		else{
			if (((month > 0 && month <8) && month % 2 == 1) || (month > 7 && month < 13) && (month % 2 == 0)){
				isMonthLong = true;
				if(day == 31 && month == 12){
					day = 1;
					month =1;
					System.out.println(day);
					System.out.println(month);
					System.out.println(++year);
				}
				else if (day == 31 && month < 12){
					day = 1;
					System.out.println(day);
					System.out.println(++month);
					System.out.println(year);
				}
				else{
					System.out.println(++day);
					System.out.println(month);
					System.out.println(year);
				}
			}
			else{
				if (isMonthLong = false){
					
				 if (day == 30 && month < 12){
						day = 1;
						System.out.println(day);
						System.out.println(++month);
						System.out.println(year);
					}
					}
				else{
					System.out.println(++day);
					System.out.println(month);
					System.out.println(year);
				}
			}
			}
			}
			}
			}