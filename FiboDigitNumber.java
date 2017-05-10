package project_Euler;

import java.math.BigInteger;

public class FiboDigitNumber {

	public static void main(String[] args) {
		int number = 12000000;
			
		BigInteger []arr = new BigInteger[number];
		arr[0] = BigInteger.ONE; 
		arr[1] = BigInteger.ONE;
		for(int i = 2; i < number; i++){
			arr[i] = arr[i-1].add(arr[i - 2]);	
			checkDigit((i+1), arr[i]);
		}
			
		
			
			
		}

	private static void checkDigit(int i, BigInteger bigInteger) {
		String number = bigInteger.toString();
		if(number.length() == 1000){
			System.out.println("First term to contain 1000 digits is : "+ i + " at " + bigInteger);
			System.exit(0);
		}
	}

	}

