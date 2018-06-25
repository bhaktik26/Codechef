package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModifiedXORSUB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk1.nextToken());
			int k = Integer.parseInt(tk1.nextToken());
			int arr[] = new int[n];
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int j = 0;
			while (tk2.hasMoreTokens()) {
				arr[j] = Integer.parseInt(tk2.nextToken());
				j++;
			}
			// dp - stores subsets (Refer to charsubset code)
			// there will be 2 to the power n rows(max that many subsets will be
			// possible and columns n as max no of elements in any subset will
			// be n)
			int dp[][] = new int[(int) Math.pow(2, n)][n];
			int xor[] = new int[(int) Math.pow(2, n)];
			for (int i = 0; i < (1 << n); i++) {
				for (j = 0; j < n; j++) {
					if ((i & (1 << j)) > 0)
						dp[i][j] = arr[j];
					xor[i] = xor[i] ^ dp[i][j];
				}
				xor[i] = k ^ xor[i];
			}
			int max = xor[0];
			for (j = 1; j < xor.length; j++) {
				if (xor[j] > max)
					max = xor[j];
			}
			System.out.println(max);
		}
	}
}
