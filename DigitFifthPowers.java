package project_Euler;

public class DigitFifthPowers {
	static double sum = 0, myNum = 0, newSum = 0;
	public static void main(String[] args) {
		for(int i = 2; i <= 1000000; i++){
			
			// Convert to string
			String num = String.valueOf(i);
			
			
			//Find 5th powers of digits and sum them
			findPower(num);
		}
		System.out.println("The total sum of fifth powers of their digits : "+newSum);
	}

	private static void findPower(String num) {
		sum = 0; 
		for(int  i = 0; i < num.length(); i++){
			String c = String.valueOf(num.charAt(i));
			sum = sum  + Math.pow(Double.parseDouble(c),5);
			
		}
		myNum = Double.parseDouble(num);
		
		
		//Find if they are the same
		compareSum(myNum, sum);
		
	
	}

	private static void compareSum(double myNum, double sum2) {
		
		// Compare the number to the sum of the digits to power 5 
		int k = Double.compare(myNum, sum2);
		
		// add the numbers if the two numbers are the same
		if(k == 0)
			addNums(myNum);
		
	}

	private static void addNums(double myNum2) {
		newSum = newSum + myNum2;	
	}

}
