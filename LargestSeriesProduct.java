package project_Euler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LargestSeriesProduct {

	private static String strLine, str = "";
	
	public static void main(String[] args) throws IOException {
		
		
		// Open the file
		FileInputStream fstream = new FileInputStream("src/Largest Product in a Series.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream)); 

		
		// Read File Line By Line
		while ((strLine = br.readLine()) != null)
				str += strLine;
		
			
		// Close the buffer stream and file
				br.close();
				fstream.close();
				
			//Create an Array and store the digits of the number into this Array	
			int[] numArray = new int[str.length()];	
			int[] numbers   = new int[str.length()];
			
			//convert the digits into integer
			for(int i = 0 ; i < numbers.length ; i++){
				numArray[i] = (int)Character.getNumericValue(str.charAt(i));
				
			}
			
			
			long max = 0;
			for(int i = 0; i < numArray.length; i++){
				long sum = 0;
				
				if((i+13)<=1000)
				sum = (numArray[i] * numArray[(i+1)] * numArray[(i+2)] * numArray[(i+3)] * numArray[(i+4)] * numArray[(i+5)] * numArray[(i+6)] * numArray[(i+7)]
						 * numArray[(i+8)] * numArray[(i+9)] * numArray[(i+10)] * numArray[(i+11)] * numArray[(i+12)]);	
				//else 
				if((i+12)<=1000)
					sum = (numArray[i] * numArray[(i+1)] * numArray[(i+2)] * numArray[(i+3)] * numArray[(i+4)] * numArray[(i+5)] * numArray[(i+6)] * numArray[(i+7)]
							 * numArray[(i+8)] * numArray[(i+9)] * numArray[(i+10)] * numArray[(i+11)]);	
				
				else 
					break;
				if(max < sum)
					max = sum;
				System.out.println(max + "\t" + i);
				
			}
			
			
					
	}
		

}
