package project_Euler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {

	//Find all the Distinct Powers
	public static void main(String[] args) {
		double [] arr = new double[9801];
		String [] arrString = new String[9801];
		double ans = 0;
		int count = 0;
		int i=0;
		for(int a = 2; a <=100; a++)
			for(int b = 2; b <=100; b++){
				ans = Math.pow(a, b);
				arr[i] = ans;
				i++;
				
			}
	
		// Convert to String
		for(int j = 0; j < arr.length; j++)
		arrString[j] = String.valueOf(arr[j]);	
	
		//Convert String to HashSet
		Set<String> stringSet = new HashSet<String>(Arrays.asList(arrString));
		String[] filteredArray = stringSet.toArray(new String[0]);
	
		for(int k = 0; k < filteredArray.length; k++)
			count++;
	
		System.out.println("Total Number of Non-Duplicated Distinct Numbers : " +count);
	
	}

}
