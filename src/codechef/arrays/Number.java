package codechef.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int i = 0;
			int a[] = new int[n];
			while (tk.hasMoreTokens()) {
				a[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			Arrays.sort(a);
			int[] flag = new int[n];
			i = 0;
			while (i < n) {
				int no = a[i];
				while (no != 0) {
					int digit = no % 10;
					if (digit == 1 || digit == 2 || digit == 3) {
						no = no / 10;
						continue;
					} else
						break;
				}
				if (no == 0)
					flag[i] = 1;
				i++;
			}
			i = 0;
			while (i < n) {
				if (flag[i] == 1)
					System.out.print(a[i] + " ");
				i++;
			}
			if (Arrays.stream(flag).allMatch(k -> k == 0))
				System.out.println(-1);
			System.out.println();
		}
	}
}
