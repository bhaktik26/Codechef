package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TADELIVE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tk1.nextToken());
		int x = Integer.parseInt(tk1.nextToken());
		int y = Integer.parseInt(tk1.nextToken());
		int a[] = new int[n];
		int b[] = new int[n];
		int i = 0, j = 0;
		StringTokenizer tk2 = new StringTokenizer(br.readLine());
		while (tk2.hasMoreTokens()) {
			a[i] = Integer.parseInt(tk2.nextToken());
			i++;
		}
		StringTokenizer tk3 = new StringTokenizer(br.readLine());
		while (tk3.hasMoreTokens()) {
			b[j] = Integer.parseInt(tk3.nextToken());
			j++;
		}
		int cntA = 0;
		int cntB = 0;
		long tip = 0;
		for (i = 0; i < n; i++) {
			if (a[i] >= b[i] && cntA < x) {
				cntA++;
				tip = tip + a[i];
				continue;
			}
			if (a[i] < b[i] && cntB < y) {
				cntB++;
				tip = tip + b[i];
				continue;
			}
			if (a[i] == b[i] && cntB < y) {
				cntB++;
				tip = tip + b[i];
				continue;
			}
			if (cntA < x) {
				cntA++;
				tip = tip + a[i];
				continue;
			}
			if (cntB < y) {
				cntB++;
				tip = tip + b[i];
				continue;
			}
		}
		System.out.println(tip);
	}
}
