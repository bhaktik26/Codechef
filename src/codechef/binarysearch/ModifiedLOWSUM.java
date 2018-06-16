package codechef.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ModifiedLOWSUM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			// k - no of chefs, q - no of queries
			int k = Integer.parseInt(tk1.nextToken());
			int q = Integer.parseInt(tk1.nextToken());
			// a - motivation, b - satisfaction
			long a[] = new long[k];
			long b[] = new long[k];
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			StringTokenizer tk3 = new StringTokenizer(br.readLine());
			int i = 0;
			while (tk2.hasMoreTokens() && tk3.hasMoreTokens()) {
				a[i] = Long.parseLong(tk2.nextToken());
				b[i] = Long.parseLong(tk3.nextToken());
				i++;
			}
			int y = 0, z;
			i = 0;
			long sum[] = new long[k * k];
			if (k <= 10000) {
				while (y < k) {
					z = 0;
					while (z < k) {
						sum[i] = a[y] + b[z];
						i++;
						z++;
					}
					y++;
				}
				Arrays.sort(sum);
			} else {
				Arrays.sort(a);
				Arrays.sort(b);
				while (y < 10001) {
					z = 0;
					while (z < 10000 / (y + 1)) {
						sum[i] = a[y] + b[z];
						i++;
						z++;
					}
					y++;
				}
				Arrays.sort(sum);
			}
			for (i = 0; i < q; i++) {
				int qVal = Integer.parseInt(br.readLine());
				System.out.println(sum[qVal - 1]);
			}
		}
	}
}
