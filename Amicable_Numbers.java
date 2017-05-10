package project_Euler;

public class Amicable_Numbers {

	public static void main(String[] args) {
		int n = 1, a = 0, b = 0 , sum_all=0;
		System.out.println("Number\t\tFirst Amicable\t\tSecond Amicable");	
		for(;n<10000;n++){
		a = first_divisor(n);
		b = second_divisor(a);
		if((n==b)&&(a!=b)){
			System.out.println(n + "\t\t " + a + "\t\t\t " + b);	
			sum_all+= + n;
		}
		}
		System.out.println("\nThe sum of all amicable numbers less than 10000 is : " + sum_all);
		
	}

	//find sum of proper divisors of n
	public static int first_divisor(int n){
		int sum_a = 0;
		for(int i = 1; i<n; i++){
			if(n % i == 0){
				sum_a += i;
			}
		}
		return sum_a;
	}
	
	//find sum of proper divisors of a
	public static int second_divisor(int a){
		int sum_b = 0;
		for(int i = 1; i<a; i++){
			if(a % i == 0){
				sum_b += i;
			}
		}
		return sum_b;
	}
}
