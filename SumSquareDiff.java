package project_Euler;

public class SumSquareDiff {

	public static void main(String[] args) {
		
		System.out.println( findSumSquares() - findSquareSum());
		
	}

	private static int findSquareSum() {
		int total = 0;
		for(int i = 1; i <= 100; i++){
			total = total + (i * i);
		}
		return total;
	}

	private static int findSumSquares() {
		int total = 0, squareTotal = 0;
		for(int i = 1; i <= 100; i++){
			total = total + i;
		}
		
		squareTotal = (total * total);
		return squareTotal;
	}

}
