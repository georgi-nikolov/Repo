
public class test {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "ehloo";
		swap(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
	  
			
	}
	static void swap(String s1, String s2){
		String temp = s1;
		s1 = s2;
		s2 = temp;
	}
}
