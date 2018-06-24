package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModifiedALTARRAY {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int val;
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int no[] = new int[n];
			int j = 0;
			while (tk.hasMoreTokens()) {
				no[j] = Integer.parseInt(tk.nextToken());
				j++;
			}
			Integer flag[] = new Integer[n];
			j = n - 2;
			// initialize last element to 1
			// flag is length array
			flag[n - 1] = 1;
			while (j >= 0) {
				// xor is negative is 2 nos have opposite sign
				val = no[j] ^ no[j + 1];
				// start comparing last no to second last no and then second
				// last to third last and so on, if the nos have same sign the
				// length would be 1
				if (val >= 0)
					flag[j] = 1;
				// nos of opp sign, then the subarray length would be 1 plus the
				// length of next element
				else
					flag[j] = flag[j + 1] + 1;
				j--;
			}
			// print the result
			for (int i = 0; i < n; i++) {
				System.out.print(flag[i] + " ");
			}
			System.out.println();
		}
	}
}
