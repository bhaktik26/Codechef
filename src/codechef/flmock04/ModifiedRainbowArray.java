package codechef.flmock04;

import java.io.*;
import java.util.*;

public class ModifiedRainbowArray {
	static class Input {
		BufferedReader br;
		StringTokenizer st;

		public Input() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) {
		Input in = new Input();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			int flag = 0;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			// find mid
			int m = n / 2;
			for (int i = 0; i < m; i++) {
				// compare first to last element and so on, difference of 2
				// consecutive elements shud be 0 or 1 and each element shud be
				// less than 7
				if ((a[i] == a[n - 1 - i]) && ((a[i + 1] - a[i] == 1) || (a[i + 1] - a[i]) == 0) && a[i] <= 7) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
			}
			if (flag == 1 && a[0] == 1 && a[m] == 7) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
