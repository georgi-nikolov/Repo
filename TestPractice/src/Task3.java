
public class Task3 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,9,12,15,20,13,25};
		int sum = getSum(arr,0,0);
		System.out.println(sum);
	}
	static int getSum(int[] arr, int index, int sum){
		if(index == arr.length)
			return sum;
		if(arr[index]%3 == 0){
			sum = sum + arr[index];
			System.out.println(sum);
		}
		return getSum(arr, index+1, sum);
	}
}
