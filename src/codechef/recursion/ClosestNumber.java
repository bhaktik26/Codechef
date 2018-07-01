package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// gfg - bs
public class ClosestNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			int a[] = new int[n];
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int i = 0;
			while (tk1.hasMoreTokens()) {
				a[i] = Integer.parseInt(tk1.nextToken());
				i++;
			}
			int closestNo = binSearch(a, 0, n - 1, k);
			System.out.println(closestNo);
		}
	}

	private static int binSearch(int[] a, int start, int end, int k) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (k == a[mid])
				return a[mid];
			if (Math.abs(k - a[mid]) <= Math.abs(k - a[mid - 1]) && Math.abs(k - a[mid]) < Math.abs(k - a[mid + 1]))
				return a[mid];
			else if (Math.abs(k - a[mid]) <= Math.abs(k - a[mid - 1])
					&& Math.abs(k - a[mid]) == Math.abs(k - a[mid + 1]))
				return a[mid + 1];
			else if (k < a[mid])
				return binSearch(a, start, mid - 1, k);
			return binSearch(a, mid + 1, end, k);
		}
		return -1;
	}
}
