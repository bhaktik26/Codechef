package codechef.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// wrong
public class MaxTipCalc {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
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
			int cntA1 = 0;
			int cntB1 = 0;
			long tip1 = 0;
			for (i = 0; i < n; i++) {
				if (a[i] >= b[i] && cntA1 < x) {
					cntA1++;
					tip1 = tip1 + a[i];
					continue;
				}
				if (a[i] < b[i] && cntB1 < y) {
					cntB1++;
					tip1 = tip1 + b[i];
					continue;
				}
				if (a[i] == b[i] && cntB1 < y) {
					cntB1++;
					tip1 = tip1 + b[i];
					continue;
				}
				if (cntA1 < x) {
					cntA1++;
					tip1 = tip1 + a[i];
					continue;
				}
				if (cntB1 < y) {
					cntB1++;
					tip1 = tip1 + b[i];
					continue;
				}
			}
			System.out.println(cntA1);
			System.out.println(cntB1);
			System.out.println(tip1);
			
			int cntA2 = 0;
			int cntB2 = 0;
			long tip2 = 0;
			for (i = 0; i < n; i++) {
				if (b[i] >= a[i] && cntB2 < x) {
					cntB2++;
					tip2 = tip2 + b[i];
					continue;
				}
				if (b[i] < a[i] && cntA2 < y) {
					cntA2++;
					tip2 = tip2 + a[i];
					continue;
				}
				if (a[i] == b[i] && cntA2 < y) {
					cntA2++;
					tip2 = tip2 + a[i];
					continue;
				}
				if (cntB2 < y) {
					cntB2++;
					tip2= tip2 + b[i];
					continue;
				}
				if (cntA2 < x) {
					cntA2++;
					tip2 = tip2 + a[i];
					continue;
				}
			}
			System.out.println(cntA2);
			System.out.println(cntB2);
			System.out.println(tip2);
			System.out.println(Math.max(tip1, tip2));
		}
	}

}
