package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DELISH {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long no[] = new long[n];
			int i = 0;
			while (tk.hasMoreTokens()) {
				no[i] = Long.parseLong(tk.nextToken());
				i++;
			}
			long minLeft[] = new long[n];
			long maxLeft[] = new long[n];
			long minRight[] = new long[n];
			long maxRight[] = new long[n];
			minLeft[0] = no[0];
			maxLeft[0] = no[0];
			minRight[n - 1] = no[n - 1];
			maxRight[n - 1] = no[n - 1];
			for (i = 1; i < n; i++) {
				minLeft[i] = Math.min(no[i], no[i] + minLeft[i - 1]);
				maxLeft[i] = Math.max(no[i], no[i] + maxLeft[i - 1]);
			}
			for (i = n - 2; i >= 0; i--) {
				minRight[i] = Math.min(no[i], no[i] + minRight[i + 1]);
				maxRight[i] = Math.max(no[i], no[i] + maxRight[i + 1]);
			}
			long result = Long.MIN_VALUE;
			for(i=0;i<n-1;i++) {
				long val1 = Math.abs(minLeft[i] - maxRight[i+1]);
				long val2 = Math.abs(maxLeft[i] - minRight[i+1]);
				result = Math.max(result, Math.max(val1, val2));
			}
			System.out.println(result);
		}
	}
}
