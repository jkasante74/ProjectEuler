package project_Euler;

public class Lexic_Permutations {
	public static String []numbers = new String[1000000];
	public static int count = 0;
	public static void main(String[] args) {
		
		perm("","0123456789");
		answer(numbers);
	}

	private static void perm(String prefix, String str){
		
		int n = str.length();
		
		if(n == 0){
			numbers[count] = prefix;
			count++;
			
			System.out.println(prefix + "\t"+ count);
		}
		else {
			for(int i = 0; i<n; i++)
				perm(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
		}
		
	}
	

	private static void answer(String []num){
		System.out.println("\n"+num[(1000000 - 1)]);
	}

	
	
}
