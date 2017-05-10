package project_Euler;
/**
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 * @author jonathanasante
 * Version 1.0
 * Date : May 10, 2017
 * 
 */

public class Palindrome {
	
	/* Declaration and initialization */
	public static long sum = 0;
	
	/**
	 * Main method that serves as entry to the class
	 * @param args			Java based argument
	 * 
	 */
	public static void main(String[] args) {
		String [] arr = new String[1998];		// Declare an array to store all palindrome numbers in base 10
		int j = 0;								// declare an initialize a variable to keep count of number of palindromes in base 10
		
		/* Check if a decimal number is palindrome and store into array */
		for(int i = 1; i <1000000 ; i++){
			String num = String.valueOf(i);
			String numReverse = new StringBuffer(num).reverse().toString();
			if(num.equalsIgnoreCase(numReverse)){
				arr[j] = num;
				j++;
			}
				
		}
		
		/* Pass palindrome decimals to convert numbers to base 2 */
		baseConverter(arr);
	}
	
	
	/**
	 * baseConverter method takes an array of decimal palindrome numbers and converts them into
	 * base 2 numbers. After that the method checks if the converted base 2 number is also a 
	 * palindrome.
	 * 
	 * If the number is a palindrome, it will printed out and added to the sum total
	 * 
	 * This method also prints out the total sum for the palindrome decimal numbers.
	 * 
	 * @param arr		array of palindromic decimal numbers
	 */
	private static void baseConverter(String[] arr) {
		for(int i = 0; i < arr.length; i++){
			String s1 = arr[i];
	        int n1 = Integer.parseInt(s1, 10);   // Convert number from string into a base 10 integer
	        String s2 = Integer.toString(n1, 2); // Convert the base 10 integer into a String in base 2 format
	      	 String numReverse = new StringBuffer(s2).reverse().toString(); // Reverse the base 2 string and store as numReverse
	        if(s2.equalsIgnoreCase(numReverse)){// Compare if the base 2 string and its reverse are the same
	        	sum = sum + Long.parseLong(arr[i]); //If true, add to the total sum and print. 
	        	System.out.println(arr[i] + "\t" + s2);
	        }
		}
		
		System.out.println("Palindrome Total  is " + sum);
}

}
