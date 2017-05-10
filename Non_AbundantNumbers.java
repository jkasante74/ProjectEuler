package project_Euler;

/**
 * Non-abundant sums
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. 
 * By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. 
 * However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed 
 * as the sum of two abundant numbers is less than this limit.
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

 * @author jonathanasante
 *
 */

public class Non_AbundantNumbers {

	public static void main(String[] args) {
		int value = 28123;
		long sum = 0;
		boolean status = false;
		for(int i = 1; i < value; i++){				//For all numbers that are sums of aboundant number or non-aboundant numbers
			status = sumChecker(i);					// check if its a non-aboundant sum
			//status = aboundChecker(i);
			if(status == true)
				sum += i;
		
		}
		System.out.println(sum);
	}
	
	
	/**
	 * This method takes a positive Integer value and check if its has the sum of two abundant numbers
	 * @param number
	 * @return stats
	 */
	public static boolean sumChecker(int number){
		boolean stats = false;
		for(int i = 0; i < number; i++){
			if((aboundChecker(i)) && (aboundChecker(number - i))){
				stats = false;
				break;
			}
			else{
				stats = true;
				
			}
		}
	//	if(stats)
	//		System.out.println(number + "\t" + stats);
		return stats;
	}
	
	/**
	 * This method checks if the selected part of the two summing numbers is an abundant number or not
	 * @param num
	 * @return checks
	 */
	public static boolean aboundChecker(int num){
		boolean checks = false;
		int total = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0){
				total += i;
			}
		}
		if(total > num){
			checks = true;
			System.out.println(num + "\t" + total + "\t"+ checks);
		}
			
		
		return checks;
	}
	
}