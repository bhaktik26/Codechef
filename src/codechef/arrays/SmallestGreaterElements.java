package codechef.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// gfg
public class SmallestGreaterElements {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int[] no = new int[n];
			int i = 0, j;
			while (tk.hasMoreTokens()) {
				no[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			for (i = 0; i < n; i++) {
				int min = Integer.MAX_VALUE;
				for (j = 0; j < n; j++) {
					if (no[i] < no[j] && no[j] < min) {
						min = no[j];
					}
				}
				if (min == Integer.MAX_VALUE)
					System.out.print("_ ");
				else
					System.out.print(min + " ");
			}
			System.out.println();
		}
	}

}
