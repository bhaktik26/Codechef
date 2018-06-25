package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XORSUB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk1.nextToken());
			int k = Integer.parseInt(tk1.nextToken());
			int arr[] = new int[n];
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int i, j = 0;
			while (tk2.hasMoreTokens()) {
				arr[j] = Integer.parseInt(tk2.nextToken());
				j++;
			}
			int max = Integer.MIN_VALUE;
			int dp[][] = new int[n][n];
			for (i = 0; i < n; i++) {
				for (j = i; j < n; j++) {
					if (i == j)
						dp[i][j] = arr[j] ^ k;
					else
						dp[i][j] = (arr[i] ^ arr[j]) ^ k;
				}
			}
			for (i = 0; i < n; i++) {
				for (j = i; j < n; j++) {
					if (dp[i][j] > max)
						max = dp[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
