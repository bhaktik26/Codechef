package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// tle - gfg
public class NineDividors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int divC = 0;
			int n = Integer.parseInt(br.readLine());
			for (int i = 2; i < n; i++) {
				int no = i;
				int j = 1;
				int count = 0;
				if (!isPrime(i)) {
					for (j = 1; j <= Math.sqrt(no); j++) {
						if (no % j == 0) {
							int factor1 = j;
							int factor2 = no / j;
							if (factor1 == factor2)
								count += 1;
							else
								count += 2;
						}
					}
					if (count == 9)
						divC++;
				}
			}
			System.out.println(divC);
		}

	}

	private static boolean isPrime(int i) {
		if (i == 2)
			return true;
		for (int j = 3; j < Math.sqrt(i); j += 2) {
			if ((i % j) == 0) {
				return false;
			}
		}
		return true;
	}
}
