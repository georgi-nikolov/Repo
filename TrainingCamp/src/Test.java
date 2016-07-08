import java.util.*;
public class Test{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		char[] masiv = {'A','D',3,4,5,6,'z',8,9,10,11,12,23,34,875};
		char[] masiv2 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','z'};
		boolean flag = false;
		
		for (int i = 0; i < masiv.length; i++) {
			for (int j=0; j<masiv2.length; j++) {
				if(masiv[i] == masiv2[j]){
					flag = true;
					break;
				}
			}
		}
		if (flag)
			System.out.println("There is a little char");
		else
			System.out.println("ai chao");
	}
}