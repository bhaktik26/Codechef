package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ALTARAY {

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
			j = 0;
			while (j < n - 1) {
				val = no[j] ^ no[j + 1];
				if (val >= 0)
					flag[j] = 0;
				// nos of opp sign
				else
					flag[j] = 1;
				j++;
			}
			flag[n - 1] = flag[n - 2];
			if (Arrays.stream(flag).allMatch(i -> i == 0)) {
				j = 0;
				while (j < n) {
					System.out.print(1 + " ");
					j++;
				}
			} else if (Arrays.stream(flag).allMatch(i -> i == 1)) {
				j = 0;
				while (j < n) {
					System.out.print(n - j + " ");
					j++;
				}
			} else {
				for (int f = 0; f < n; f++) {
					if (flag[f] == 0)
						no[f] = 1;
					else {
						val = 0;
						j = f;
						while (f < n && flag[f] == 1) {
							val++;
							f++;
						}
						f = j;
						no[f] = val + 1;
					}
				}
				j = 0;
				while (j < n) {
					System.out.print(no[j] + " ");
					j++;
				}
			}
		}
	}
}
