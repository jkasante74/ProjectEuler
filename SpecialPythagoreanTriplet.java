package project_Euler;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		int total = 0;
		for(int a = 1; a<1000 ; a++){
			for(int b = 1 ;b<1000; b++){
				total = ((a*a) + (b*b));
				int c = (int)Math.sqrt(total);
				if((Math.pow(c, 2) == total)&&(b > a))
					findSum(a, b, c);
			}
		}

	}
	
	public static void findSum(int a, int b,int c){
		//System.out.println(a + "\t" + b + "\t" + c);
		if((a + b + c) == 1000){
			System.out.println("The numbers of a , b , c that sum to 1000 are : " + a + "\t" + b + "\t" + c);
			long sum = a * b * c;
			System.out.println("The multiplication of \t \t \t \t" + a + "\t" + b + "\t" + c + " \t = " + sum);
		}
		
	}

}
