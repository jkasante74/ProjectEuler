package project_Euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 * @author jonathanasante
 *
 */

public class SmallestMultiple {
	public static boolean status = false;
	public static void main(String []args){
		
		long num = 900000000;
		long nums =232792560;
		for(long i = 21; i <= num; i++){
			checkSmallest(i);
		//	System.out.println(i);
			if(status == true){
				System.out.println("Smallest positive Number : "+ i);
				break;
			}
				
		}
		
		System.exit(0);
	}
	
	public static boolean checkSmallest(long number){
		
		for(int i = 1; i<=20; i++){
			if(number % i != 0){
				status = false;
				break;
			}
			else{
				status = true;
			}
			
		}
		return status;
	}
}
