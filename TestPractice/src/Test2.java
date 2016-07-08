
public class Test2 {
	public static void main(String[] args) {
		String s1 = "String that has text";
		String s2 = "Another one that has some";
		String s3 = "Third one that has any";
		String result = longestWord(s1,s2,s3);
		System.out.println(result);
	}
	static String longestWord(String s1, String s2, String s3){
		String[] one = s1.split(" ");
		String[] temp = new String[2];
		int max = 0;
		int idx = 0;
		for (int i = 0; i < one.length; i++) {
			if(s1.contains(one[i]) && s2.contains(one[i])){
				temp[i] = one[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if(temp[i].length()>max){
				max = temp[i].length();
				idx = i;
			}
		}
		return temp[idx];

		System.out.println("Dopisan text za commit");s
	}
}
