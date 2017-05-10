/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file 
 * containing over five-thousand first names, begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical
 * position in the list to obtain a name score.

 * For example, when the list is sorted into alphabetical order, COLIN, 
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?

 */

package project_Euler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//import java.util.Collections;

public class Name_Summer {


	
	static String allnames;
	public static void main(String[] args) {
		
    try{
    	File file = new File("src/names.txt");
    	FileReader fileReader = new FileReader(file);
    	BufferedReader bufferedReader = new BufferedReader(fileReader);
    	StringBuffer stringBuffer = new StringBuffer();
    	String line;
    	while((line = bufferedReader.readLine()) !=null){
    		stringBuffer.append(line);
    	//	stringBuffer.append("\n");
    	}
    	
    	fileReader.close();
    	
    	allnames = stringBuffer.toString();
    
    	
    }
    catch (IOException e) {
    	e.printStackTrace();
    		
    	}
    //store the names in an array at the comma separation	
    String [] names = allnames.split(",");
    String [] unquoted = new String [names.length];
   
    //Remove the quotation marks
    for(int i = 0; i<names.length;i++)
    	unquoted[i] = names[i].substring(1, (names[i].length()-1));
    
   
    
    //Sort the names
    Arrays.sort(unquoted, 0, unquoted.length);
    
    //print sorted array
    System.out.println("Sorting the Arrays: ");
    for(int i = 0; i<unquoted.length;i++){
    	//System.out.println(unquoted[i]);
    }
    int [] name_sum = new int[unquoted.length];
    int sum = 0, final_sum=0, position = 1;
    
    //sum the positions of the individual characters in each name
        for(int i = 0; i<unquoted.length; i++){
		sum = 0;
    	for(int j = 0; j<unquoted[i].length(); j++){
    		if (unquoted[i].charAt(j)=='A')
    			sum+=1;
    		if (unquoted[i].charAt(j)=='B')
    			sum+=2;
    		if (unquoted[i].charAt(j)=='C')
    			sum+=3;
    		if (unquoted[i].charAt(j)=='D')
    			sum+=4;
    		if (unquoted[i].charAt(j)=='E')
    			sum+=5;
    		if (unquoted[i].charAt(j)=='F')
    			sum+=6;
    		if (unquoted[i].charAt(j)=='G')
    			sum+=7;
    		if (unquoted[i].charAt(j)=='H')
    			sum+=8;
    		if (unquoted[i].charAt(j)=='I')
    			sum+=9;
    		if (unquoted[i].charAt(j)=='J')
    			sum+=10;
    		if (unquoted[i].charAt(j)=='K')
    			sum+=11;
    		if (unquoted[i].charAt(j)=='L')
    			sum+=12;
    		if (unquoted[i].charAt(j)=='M')
    			sum+=13;
    		if (unquoted[i].charAt(j)=='N')
    			sum+=14;
    		if (unquoted[i].charAt(j)=='O')
    			sum+=15;
    		if (unquoted[i].charAt(j)=='P')
    			sum+=16;
    		if (unquoted[i].charAt(j)=='Q')
    			sum+=17;
    		if (unquoted[i].charAt(j)=='R')
    			sum+=18;
    		if (unquoted[i].charAt(j)=='S')
    			sum+=19;
    		if (unquoted[i].charAt(j)=='T')
    			sum+=20;
    		if (unquoted[i].charAt(j)=='U')
    			sum+=21;
    		if (unquoted[i].charAt(j)=='V')
    			sum+=22;
    		if (unquoted[i].charAt(j)=='W')
    			sum+=23;
    		if (unquoted[i].charAt(j)=='X')
    			sum+=24;
    		if (unquoted[i].charAt(j)=='Y')
    			sum+=25;
    		if (unquoted[i].charAt(j)=='Z')
    			sum+=26;
    	}
    	name_sum[i] =sum; 
    		
	}
        for(int i = 0; i<name_sum.length;i++){
        	
        	name_sum[i] = name_sum[i]*(position);
        	System.out.println(unquoted[i] + " : " + " \t "+ name_sum[i]);
    		position++;
        }
    
    for(int i = 0; i<name_sum.length;i++)
    	final_sum +=name_sum[i];
    
    System.out.println("\nThe Final Sum of all the names is : "+ final_sum);
	}

}
