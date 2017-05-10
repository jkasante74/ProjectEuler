package project_Euler;

public class ReciprocalCycles {

	private static final int LIMIT = 1000; 		// Declare limit of the values.
	
    public static void main(String[] args) {  
         int result = 0;  						// Declare and set result to 0
         int longest = 0;  						// Declare and set longest to 
         for (int i=2; i<LIMIT; i++){  
              int recurringNum = recurringNum(i);   // Find number of recurring numbers in the current d value
              if (recurringNum > longest){  
                   longest = recurringNum;  		// replace if the new recurring length is more than the current one
                   result = i;  
              }  
         }  
         System.out.println(result);  
    }  
    public static int recurringNum(int num) {  
         int[] arr = new int[num+1];  
         int index = 1;  
         int mod = 1;  
         while(mod != 0 && arr[mod] == 0){  
              arr[mod]=index++;  
              mod = mod * 10 % num;  
         }  
         if (mod == 0){  
              return 0;  
         }  
         return index-arr[mod];  
 }  
}
