package project_Euler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
*  Find the sum of all the primes below two million.
 * @author jonathanasante
 *
 */
public class SummationOfPrimes {
	

	public static void main(String[] args) {
		
		int n = 2000000;
		long sum = 0;
		boolean status = false;
		for(int i = 2; i < n ; i++){
			status = checkPrime(i);
			if(status == true){
				sum +=i;
				System.out.println(i);
			}
			
		}
				
		System.out.println("Total sum of Prime Numbers is : " + sum);
		
	}
	
	public static boolean checkPrime(int number){
		boolean status = true;
		
		if(number == 2)
			status = true;
		for(int i = 2; i < (int)Math.sqrt(number)+1; i++){
			if(number % i == 0)
				status = false;
		}
		return status;
	}
	
	

}