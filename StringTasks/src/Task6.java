
public class Task6 {

	public static void main(String[] args) {
		String[] data = {"abc","def","hig","klm"};
		String result = new String();
		for (int i = 0; i < data.length; i++) {
			result = result.concat(data[i]);
		}
		System.out.println(result);
	}
}
