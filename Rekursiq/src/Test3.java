
public class Test3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int counter = 0;
		int min = arr[0];
		int max = arr[0];
		int diff = getMinMaxDiffRec(arr,counter,min,max);
		System.out.println(diff);
	}
	static int getMinMaxDiffRec(int[] arr, int counter, int min, int max){
		int diff;
		if(counter==arr.length){
			diff = max - min;
			return diff;
		}
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
			if(max<arr[i])
				max = arr[i];
		}
		return getMinMaxDiffRec(arr,counter+1,min,max);
	}
}
