
public class HW9 {
	
	public static void main(String[] args) {
		
		 String input = "asd-12sdf45-56asdf100";
	     int sum = 0;
	     int temp = 0;
	     int factor = 1;
	     
	     for(int i=input.length()-1; i!=0; i--){
	    	 if((input.charAt(i)>47) && (input.charAt(i)<58)){
	    		 temp = temp + (input.charAt(i) - '0')*factor;
	    		 factor = factor*10;
	    	 }
	    	 else if (input.charAt(i)=='-'){
	    			 temp = 0-temp;
	    			 sum = sum + temp;
	    			 temp = 0;
	    			 factor = 1;
	    	 }
	    	 else{
	    		 sum = sum + temp;
	    		 temp = 0;
	    		 factor = 1;
	    	 }
	    }
	     System.out.println(sum);
	}
}
