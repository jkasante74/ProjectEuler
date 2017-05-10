package project_Euler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class PanDigital {
	static int num = 10000;
	static int sum, index = 0;
	static int [] myNum = new int[50];
	public static void main(String[] args) {
		findProduct();
		removeDup(myNum);
		System.out.println("The sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital is : "+sum);

	}

	

	private static void findProduct() {
		for(int i = 1; i < num; i++)
			for(int j = 1; j < num; j++){
				checkStringLength(i, j, i*j);
			}
	}

	private static void checkStringLength(int i, int j, int prod) {
		String number = String.valueOf(i) + String.valueOf(j) + String.valueOf(prod);
		if(number.length() == 9){
			checkPanDigit(number, prod);
		}
	}

	private static void checkPanDigit(String number, int prod) {
		if((number.contains("1"))&&(number.contains("2"))&&(number.contains("3"))&&(number.contains("4"))&&(number.contains("5"))&&(number.contains("6"))&&(number.contains("7"))&&(number.contains("8"))&&(number.contains("9"))){
			myNum[index] = prod;
			index++;
		}
	}
	/**
	 * Remove duplicates
	 * @param myNum2
	 */
	private static void removeDup(int[] myNum2) {
		Arrays.sort(myNum2);
		
		// Convert Array values to set to remove duplicates
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < myNum2.length; i++){
		  set.add(myNum2[i]);
		}
		
		// Convert set back to Array
		Integer[] newArray = set.toArray(new Integer[set.size()]);
		
		//System.out.println(set);
		
		for(int i = 0; i < newArray.length; i++)
			//System.out.println(newArray[i]);
			sum = sum + newArray[i];
		
	}

}
