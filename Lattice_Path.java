package project_Euler;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Lattice_Path {

	public static void main(String[] args) {
		double m = 20, n = 20, num1 = 0, num2 = 0;
		num1 = factorial(m+n);
		num2 = (factorial(m) * factorial(n));
		BigInteger k = new BigDecimal((num1/num2)).toBigInteger();
		System.out.println("The factorial for the " + m + " by " + n + " grid is : " + k);
		//System.out.print(num1 + "\t" + num2);
		
	}
	
	public static double factorial(double value){
		double fact = 1;
	      
	         for ( int c = 1 ; c <= value ; c++ )
	            fact = fact*c;
	     
	      return fact;
	}
	

}
