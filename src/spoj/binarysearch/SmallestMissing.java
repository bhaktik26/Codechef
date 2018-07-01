package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// gfg 
public class SmallestMissing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			int a[] = new int[n];
			int i = 0;
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			while (tk1.hasMoreTokens()) {
				a[i] = Integer.parseInt(tk1.nextToken());
				i++;
			}
			for (i = 0; i < m; i++) {
				int index = Arrays.binarySearch(a, i);
				// if element isnt present negative index is returned
				if (index < 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
