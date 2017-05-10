package project_Euler;

public class RecursiveCurves {

	public static void main(String[] args) {
		//declare variables
		int sequenceLength = 0;
		int pos = 0;
		
		for (int i = 1000; i > 1; i--) {
		    if (sequenceLength >= i) {
		        break;
		    }
		    
		    //create an array to hold all the remainders found from a number
		    int[] foundRemainders = new int[i];
		    int value = 1;
		    int position = 0;
		 
		    while (foundRemainders[value] == 0 && value != 0) {
		        foundRemainders[value] = position;
		        value *= 10;
		        value %= i;
		        position++;
		    }
		 
		    if (position - foundRemainders[value] > sequenceLength) {
		        sequenceLength = position - foundRemainders[value];
		        pos = i;
		    }

	}
		
		System.out.println("The number with the longest sequence is :"+pos+" \nLength is : "+sequenceLength);
	}
}


