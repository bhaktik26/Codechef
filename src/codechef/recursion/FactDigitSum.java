package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//tle
public class FactDigitSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int x = Integer.parseInt(br.readLine());
			int l = 1;
			while (l != x) {
				int sumFact = 0;
				int no = l;
				while (no != 0) {
					int digit = no % 10;
					no = no / 10;
					sumFact = sumFact + fact(digit);
				}
				if (sumFact == x) {
					System.out.println(l);
					break;
				}
				l++;
			}
		}
	}

	private static int fact(int digit) {
		int f;
		if (digit == 1 || digit == 0)
			return 1;
		else {
			f = digit * fact(digit - 1);
			return f;
		}
	}
}
