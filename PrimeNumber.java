package project_Euler;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 9999999; i++){
			
			//check if number is Prime
			if(isPrime(i))
				count++;
			
			if(count == 10001){
				System.out.println("The 10001st prime  number is : "+ i);
			break;
			}
		}
	}

	 //checks whether an int is prime or not.
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
}
