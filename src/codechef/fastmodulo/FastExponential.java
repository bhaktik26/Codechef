package codechef.fastmodulo;

public class FastExponential {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		System.out.println(fast_exp(2, 4));
	}
	
	static long fast_exp(long base, int exp) {
	    long res=1;
	    while(exp>0) {
	       if(exp%2==1) res=(res*base)%MOD;
	       base=(base*base)%MOD;
	       exp/=2;
	    }
	    return res%MOD;
	}
}
