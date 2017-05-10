package project_Euler;

import java.math.BigInteger;

/**
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * Find the sum of all numbers which are equal to the sum of the 
 * factorial of their digits.
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * @author jonathanasante
 *
 */
public class DigitFactorials {
	public static int sum = 0, totals = 0;
	public static void main(String[] args) {
		for(int i = 10; i <= 1000000; i++){
			findDigitSum(i); //Find the digits of the number and add their factorial
			compareNums(i,sum); // compare the sum of the digits factorial to the number
			sum = 0;
			
		}
		System.out.println("The sum of all numbers which are equal to the sum of the factorial of their digits is : " + totals); //if they are the same add the numbers in this category
	}
	
	/**
	 * This method compares the sum of the digits' factorial to the number itself
	 * @param i
	 * @param sum
	 */
	private static void compareNums(int i, int sum) {
		if(i == sum){
			System.out.println(i + "\t" +sum);
			sumOfNum(i);
		}
	}
	
	/**
	 * This method finds the sum of all numbers that meet the criteria.
	 * @param i
	 */
	private static void sumOfNum(int i) {
		totals = totals + i;
		
	}

	/**
	 * Find the sum of the factorial of the Digits 
	 * @param num
	 */
	private static void findDigitSum(int num) {
		String s = String.valueOf(num);
		for(int i = 0; i < s.length(); i++){
			sum = sum + fact(Character.getNumericValue( s.charAt(i)));
			
		}
		
		
	}
	
	
	
	
	
	
	/**
	 * This method finds the factorial of a number
	 * @param n
	 * @return
	 */
	 public static int fact(int n) {
	        int fact = 1; // this  will be the result
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	   }
	
}
