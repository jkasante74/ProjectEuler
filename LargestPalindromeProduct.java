/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.

 */

package project_Euler;

public class LargestPalindromeProduct {
	public static int max = 0;
	public static void main(String[] args) {
		int sum = 0;
		for(int a = 1; a <= 999; a++){
			for(int b = 1; b <= 999; b++){
				sum = a * b;
				checkPalindrome(sum);
			}
    	
		}

		System.out.println("The maximum Palindrome from the product of two digit numbers are : " + max);

	}
	
	public static void checkPalindrome(int value){
		int temp = 0; 
		String num = String.valueOf(value);
		String numrev = new StringBuffer(num).reverse().toString();
		int number = Integer.parseInt(num);
		int numbrev = Integer.parseInt(numrev);
		
		
		if(number == numbrev){
			temp = number;
			if(temp >=max){
				max = temp;
			}
				
		}
	}

}
