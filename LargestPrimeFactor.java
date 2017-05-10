package project_Euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 * @author jonathan asante
 *
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		int max = 0;
		long number = 600851475143L;
		
		//Iterate from 2 to a number less than the value
		for(int i = 2; i < Math.sqrt(number); i++)
			if(((number) % i == 0)&&(checkPrime(i)) &&(i > 0))
				max = i;	
				System.out.println("The highest prime factor of 600851475143 is : "+ max);
			
	}
		
		
	
	/**
	 * This method checks if the divisor (i) is a prime number
	 * @param number
	 * @return status
	 */
	 public static boolean checkPrime(long number){
		boolean status = true;
		if(number == 2){
			status = true;
		}
		
		for(int i = 2; i < number; i++){
			if(number % i == 0)
				status = false;
		}
	
		return status;
	}

}
