package project_Euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FactorialDigitSum {

	public static void main(String[] args) {
		
	BigInteger k = (fact(100));
	System.out.println(k);
	sumDigit(k.toString());
	
	}

	private static void sumDigit(String value) {
		int ans = 0;
		for(int i = 0; i < value.length(); i++){
			ans = ans + Character.getNumericValue(value.charAt(i)); 
		}
		
		System.out.println("The sum of the digits for 100! : " +ans);
	}

	public static BigInteger fact(int a) {
	    return a == 1 ? BigInteger.ONE : BigInteger.valueOf(a).multiply(fact(a - 1));
	}

}
