package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELRCPT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int p = Integer.parseInt(br.readLine());
			int res = 0;
			int r;
			// while no is greater than 2048
			while (p > 2048) {
				p = p - 2048;
				res++;
			}
			// find binary representation, no of 1's represent how the no is expressed as powers of 2
			while (p != 0) {
				r = p % 2;
				p = p / 2;
				if (r == 1)
					res++;
			}
			System.out.println(res);
		}
	}
}
