
public class Task10 {
public static void main(String[] args) {
		int[] a = {4, 1, 1, 4, 2, 3, 4, 4, 4, 1, 2, 4, 9, 3};
	 int count = 1, tempCount;
	  int popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++){
	    temp = a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++){
	      if (temp == a[j])
	        tempCount++;
	      }
	    if (tempCount > count){
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  System.out.print(popular + " appears " + (count+1) + " times");
}
}
