
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int x = 10;
		System.out.println(findIndexBinary(arr,x,0,arr.length-1));
	}
	static int findIndexBinary(int[]arr, int x, int left, int right){
		int mid = (left+right)/2;
		if(x==arr[mid])
			return mid;
		if(left>right)
			return -1;
		if(arr[mid]>x){
			right = mid-1;
		}
		else if(arr[mid]<x){
			left = mid+1;
		}
		return findIndexBinary(arr,x,left,right);
	}
}
	
		
	

