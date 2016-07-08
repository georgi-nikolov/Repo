
public class Task1 {

	public static void main(String[] args) {
		String one = "Hello world!";
		String two = "Hello";
		if(one.substring(0,two.length()).contains(two))
			System.out.println("The second string is a prefix of the first one");
		else
			System.out.println("The second string is not a prefix.");
		
	}
	
}
