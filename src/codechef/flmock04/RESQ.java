package codechef.flmock04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RESQ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			int factor1, factor2;
			int min = Integer.MAX_VALUE;
			// find the factors of n and their absolute diff
			// to find factors, the loop can run only till sqrt n
			for (int i = 1; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					factor1 = i;
					// second factor can be obtained by dividing first factor
					// from the no
					factor2 = n / i;
					int difference = Math.abs(factor1 - factor2);
					// difference between 2 factors shud be min
					if (difference <= min)
						min = difference;
				}
			}
			System.out.println(min);

		}
	}
}
