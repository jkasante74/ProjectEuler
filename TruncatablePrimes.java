package project_Euler;

public class TruncatablePrimes {

	public static void main(String[] args) {
		boolean flag = false, flag1 = false;
		long sum = 0;
		
		for(int num = 11; num <= 3797; num++){
			
			String strNum = String.valueOf(num);
			
			
			for(int i = 0; i < strNum.length(); i++){
				boolean status = checkPrime(Integer.parseInt(strNum.substring(i)));
			
				if(status)
					flag = true;
				
				else{
					flag = false;
					break;
				}
			
			}
		
			for(int i = 0; i < strNum.length(); i++){
		
				int nums = Integer.parseInt(strNum.substring(0, strNum.length()-i));
				boolean status1 = checkPrime(nums);
				
				
				if(status1){
					flag1 = true;
				
				}
				
				else{
					flag1 = false;
					
					break;
				}
			
			}
			
			if((flag)&&(flag1)){
				sum = sum+ num;
				System.out.println(num +"\t" + flag +"\t" + flag1 + "\t" + sum);
					
			}
				
		}
		System.out.println("The sum of the 11 reverse trucatable Primes is : \t" + (739397 + sum));
	}
	
	
	
	
	/**
	 * This method checks if the divisor (i) is a prime number
	 * @param number
	 * @return status
	 */
	 public static boolean checkPrime(int number){
		boolean status = true;
		

		if(number == 1){
			status = false;
		}
		
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
