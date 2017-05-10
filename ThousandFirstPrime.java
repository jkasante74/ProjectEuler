package project_Euler;
/**
 * 

 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?

 * @author jonathanasante
 *
 */
public class ThousandFirstPrime {

	public static void main(String[] args) {
		int pos = 0;
		int n = 14000000;
		long count = 0;
		boolean status = false;
		for(int i = 2; i < n ; i++){
			status = checkPrime(i);
			if(status == true){
				pos = i;
				count++;
				System.out.println(i);
			}
			if(count == 10001){		
				System.out.println("The " + count + "th prime number is : " + pos);
				break;
			}
		}
		
		
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
