import java.util.Scanner;
public class JavaLessonOne 
{

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		System.out.println("Type in a number: ");
		
		if (userInput.hasNextInt())
		{
		int Number = userInput.nextInt();
		
			System.out.println("You typed: " + Number);
			
	}
		else
		{
		
			System.out.println("That is not a number!");
		
		}
	
	}
}
