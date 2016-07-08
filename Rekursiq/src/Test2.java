
public class Test2 {
	public static void main(String[] args) {
		String input = "a a a b b b b c d d e f g g g h";
		System.out.println(blabla(input));
	}
	static String blabla(String input){
		String[] words = input.split(" ");
		int maxcnr = 1;
		int counter = 0;
		String max = words[0];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])){
					counter++;
				}
			}
			if(counter>maxcnr){
				max = words[i];
				maxcnr = counter;
			}
			counter = 0;
		}
		return max;
	}
}
