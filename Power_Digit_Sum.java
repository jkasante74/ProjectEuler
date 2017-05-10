package project_Euler;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Question:
 * 
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

 * 
 * @author jonathanasante
 *
 */
public class Power_Digit_Sum {

	public static void main(String[] args) {
		BigInteger ans = powerFinder();
		
		digitSum(ans);
		
	}
	
	/**
	 * This method returns the answer of 2 power 1000 to the main method
	 * @return k
	 */
	public static BigInteger powerFinder(){
		double power = Math.pow(2, 1000);
		BigInteger k = new BigDecimal(power).toBigInteger();
		System.out.println(k);
		return k;
	}
	
	public static void digitSum(BigInteger value){
		String str = value.toString();							// Convert BigInteger to String
		int sum = 0;
		int[] digArray = new int [str.length()];				// Create and array of size equal to the size of the string
		
		for(int i = 0; i<digArray.length; i++)					//Convert individual digits of the string into an integers and store in an array
		digArray[i] = Character.getNumericValue(str.charAt(i));
		
		//sum all the elements in the array
		for(int j = 0; j<digArray.length; j++)
			sum+=digArray[j];
		
		System.out.println("Sum of the digits of 2 to power 1000 is : "+ sum);
	}

}
