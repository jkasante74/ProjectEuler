package project_Euler;

public class CoinSum {
	public static int count = 0, sum = 0; 
	
	public static void main(String[] args) {
		
		for(int i = 0; i<= 200 ; i=i+200){
		
			for(int j = 0; j <=200; j=j+100){
			
				for(int k = 0; k <=200; k=k+50){
					
					for(int l = 0; l <=200; l=l+20){
					
						for(int m = 0; m <=200; m=m+10){
						
							for(int n = 0; n <=200; n=n+5){
							
								for(int o = 0; o <=200; o=o+2){
								
									for(int p = 0; p <=200; p=p+1){
										sum = i+j+k+l+m+n+o+p;
										if(sum==200){
											count++;
										}
									}
								}	
							}
						}
					}
				}
			}
		}
		System.out.println("The number of ways £2 can be made using any number of coins is : "+count);

	}

}
