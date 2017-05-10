package project_Euler;

public class Rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permu(0,"1000");
	}
	
	static void permu(int fixed,String s) {
	    char[] chr=s.toCharArray();
	    int num = Integer.parseInt(s);
	    if(fixed==s.length()){
	        
			System.out.println(s);
	    }
	    for(int i=fixed;i<s.length();i++) {
	        char c=chr[i];
	        chr[i]=chr[fixed];
	        chr[fixed]=c;
	        permu(fixed+1,new String(chr));
	    }   
	}

}
