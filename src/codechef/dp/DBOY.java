package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DBOY {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			Integer k[] = new Integer[n];
			Integer h[] = new Integer[n];
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int i = 0;
			while (tk1.hasMoreTokens() && tk2.hasMoreTokens()) {
				h[i] = Integer.parseInt(tk1.nextToken());
				k[i] = Integer.parseInt(tk2.nextToken());
				i++;
			}
			long count = 0;
			int max = Arrays.stream(h).mapToInt(y -> 2 * y).max().getAsInt();
			long dp[] = new long[max + 1];
			dp[0] = 0;
			for (i = 1; i <= max; i++) {
				long min = Integer.MAX_VALUE;
				for (int j = 0; j < n; j++) {
					int inx = i - k[j];
					if (inx >= 0)
						min = Math.min(dp[inx], min);
				}
				dp[i] = 1 + min;
			}
			for (i = 0; i < n; i++) {
				int inx = 2 * h[i];
				count += dp[inx];
			}
			System.out.println(count);
		}
	}
}
