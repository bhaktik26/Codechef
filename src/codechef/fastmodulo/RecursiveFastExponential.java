package codechef.fastmodulo;

public class RecursiveFastExponential {

	public static void main(String[] args) {
		long pow = fast_exp(2, 12);
		System.out.println(pow);

	}

	private static long fast_exp(int base, int exp) {
		if (exp == 1)
			return base;
		else {
			if (exp % 2 == 0) {
				long exp1 = (long) Math.pow(fast_exp(base, exp / 2), 2);
				if (exp1 >= 1000000007)
					return exp1 % 1000000007;
				else
					return exp1;
			} else {
				long exp2 = (long) Math.pow(base * fast_exp(base, (exp - 1) / 2), 2);
				if (exp2 >= 1000000007)
					return exp2 % 1000000007;
				else
					return exp2;
			}
		}
	}
}
