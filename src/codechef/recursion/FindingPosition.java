package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// gfg 
public class FindingPosition {
	// found a pattern
	// for no = 2,3 pos = 2
	// for no = 4,5,6,7 pos = 4
	// for no = 8 to 15, pos = 8
	// and so on pos will be powers of 2
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int no = Integer.parseInt(br.readLine());
			for (int i = 0;; i++) {
				if (no >= Math.pow(2, i) && no < Math.pow(2, i + 1)) {
					System.out.println((int) Math.pow(2, i));
					break;
				}
			}
		}
	}
}
