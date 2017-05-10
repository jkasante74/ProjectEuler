package project_Euler;



public class Number_Letter_Count {

//Create Arrays for all the units in the numeral system
 private static final String[] specialNames = { "", " thousand", " million", " billion", " trillion", " quadrillion", " quintillion"};
   
 private static final String[] tensNames = {""," ten"," twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
   
 private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten"," eleven", " twelve",
                                            " thirteen"," fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
   
 static String[] numWords = new String[1000];
 static int[] wordsLength = new int[1000];
 
   private String convertLessThanOneThousand(int number) {
       String current;
       
       if (number % 100 < 20){							
           current = numNames[number % 100];
           number /= 100;
       }
       else {
           current = numNames[number % 10];					
           number /= 10;
           
           current = tensNames[number % 10] + current;
           number /= 10;
       }
       if (number == 0) return current;
       if(current == "")
    	   return numNames[number] + " hundred " + current;
       
       return numNames[number] + " hundred and" + current;
   }
   
   /**
    * This method takes the integer number from the main method as a parameter
    * @param number
    * @return
    */
   public String convert(int number) {

       if (number == 0) { return "zero"; } 		// Just return the string as zero if the integer input parameter is zero
       
       String prefix = "";						
       
       if (number < 0) {
           number = -number;					// Convert the number into negative if the number is less than 0 and change prefix to negative
           prefix = "negative";
       }
       
       String current = "";
       int place = 0;
       
       do {
           int n = number % 1000;					//Check if the number is in the thousands or above by finding the remainder of number divided by 1000
           if (n != 0){
               String s = convertLessThanOneThousand(n); //call the convert Less than 1000 method to convert the remainder of the number(hundreds, tens, ones)
               current = s + specialNames[place] + current;
           }
           place++;
           number /= 1000;
       } while (number > 0);
       
       return (prefix + current).trim();
   }
   
   public static void main(String[] args) {
	   Number_Letter_Count obj = new Number_Letter_Count();
	   System.out.println("Word\t\t\t\t\tLength \n");
	   
      for(int i = 1; i<=1000;i++){
    	 String word = obj.convert(i);					// Convert the number to the word equivalent 
    	 String str = new String(word);					// Make sure its a string
    	 str = str.replaceAll(" ",""); 					// Remove all spaces
    	 wordsLength[(i-1)] = str.length();				//find length of the string and store in an array
    	
    	System.out.println(word + "\t\t\t\t\t" + wordsLength[(i-1)]);  	
      }
      int sum = 0;
      for(int num = 0; num < wordsLength.length; num++)
    	  sum +=wordsLength[num];
    	 
      System.out.println("Total number of Letters from 1 to 100 is : " + sum); 
      
      
      
      
   }
      
}

