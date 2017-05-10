package project_Euler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LargeSum {

	public static void main(String[] args) throws IOException {
		
	
		BigInteger numsum = BigInteger.ZERO ;	//Initialize the variable "numsum" as a BigInteger
		
		String strLine;
		
		// Open the file
		FileInputStream fstream = new FileInputStream("src/LargeSum.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream)); 

		
		// Read File Line By Line
		while ((strLine = br.readLine()) != null) 
			numsum =  numsum.add(new BigInteger(strLine));		// Find the sum of the converted numbers  
			
		// Close the buffer stream and file
		br.close();
		fstream.close();
		
		//Print the total sum
		System.out.println("TThe total sum is : " + numsum);
		
		String s = numsum.toString();
		String sub = s.substring(0, 10);
	    
		//Print the first ten digits of the sum
		System.out.println("he first ten digits of the sum : " + sub);
		
	    }
	    

	}


