package project_Euler;

public class TriangularNumbers {
	public static int count = 0;
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; count <= 500; i++){
			sum = sum + i;
		//	System.out.println(i + " Triangular Numbers are : "+ sum);
			factFinder(sum);
		//	System.out.println();
		}
	}
	
	public static void factFinder(int num){
		count = 0;
	//	System.out.print(num + " : ");
		for(int i = 1; i <= Math.sqrt(num) ; i++){
			if(num % i == 0){
		//		System.out.print(i + ",");
				count++;
			}
		}
		count *=2;
		if(count >=501)
		System.out.print("Answer is : "+ num + "\t count : "+ count);
	}

	

}
