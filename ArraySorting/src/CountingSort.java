
public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {4,1,2,4,3,1,1,4,2,2,3,1};
		int[] minMax = findMinMaxElement(arr);
		int[] counters = createCounterArray(arr,minMax);
		sortArray(arr,counters);
		printResult(arr);
	}
	
	static int[] findMinMaxElement(int[] arr){
		int[] minMax = new int[2];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>minMax[1])
				minMax[1] = arr[i];
			if(arr[i]<minMax[0]){
				minMax[0] = arr[i];
				if(minMax[0]<0)
					minMax[0] = minMax[0] + (2*minMax[0]);
			}	
			
		}
		return minMax;
	}
	
	static int[] createCounterArray(int[] arr, int[] minMax){
		int[] counters = new int[minMax[0] + minMax[1]+1];
		for(int i = 0; i<arr.length; i++){
			counters[arr[i]]++;
		}
		return counters;
	}
	
	static void sortArray(int[]arr, int[] counters){
		int cnr = 0;
		loop:
		for(int i=0; i<counters.length; i++){
			while(counters[i]>0){
				arr[cnr] = i;
				counters[i]--;
				if(cnr == arr.length-1)
					break loop;
				else
				cnr++;
			}
		}
	}
	
	static void printResult(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
}
