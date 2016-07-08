public class Practice1 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		int sum = x;
		int sum2 = x;
		int counter = 1;
		int counter2 = 1;
		int temp = x;
		int one = getPowerRec(x,n,sum,counter,sum2,counter2,temp);
		System.out.println(one);
	}
	static int getPowerRec(int x, int n, int sum, int counter, int sum2,int counter2, int temp){
		if(counter==n)
			return sum2;
		temp = getEachStep(x,n,sum2,counter2,temp);
		sum2 = temp;
		return getPowerRec(x,n,sum,counter+1,sum2,counter2,temp);
	}
	static int getEachStep(int x, int n, int sum2, int counter2,int temp){
		if(counter2==x)
			return sum2;
		sum2 = sum2 + temp;
		return getEachStep(x,n,sum2,counter2 +1,temp);
	}
}