package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MATRIX2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int i, j;
		long count = 0;
		char matrix[][] = new char[n + 1][m + 1];
		int dp[][] = new int[n + 1][m + 1];
		char[] row = new char[m];
		for (i = 1; i <= n; i++) {
			String values = br.readLine();
			row = values.toCharArray();
			for (j = 1; j <= m; j++) {
				matrix[i][j] = row[j - 1];
			}
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				if (matrix[i][j] == '1' && matrix[i - 1][j - 1] == '1' && matrix[i - 1][j] == '1') {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + 1;
				} else if (matrix[i][j] == '1')
					dp[i][j] = 1;

				count += dp[i][j];
			}
		}
		System.out.println(count);
	}
}
