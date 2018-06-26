package codechef.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MRGSRT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(tk.nextToken());
			int end = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			System.out.println(mergeSort(start, end, k, 0));
		}
	}

	private static int mergeSort(int start, int end, int k, int i) {
		// fn cant be called since k is not in valid range
		if (k < start || k > end)
			return -1;
		// fn can be called
		else {
			// print the start n end indexes
			System.out.println(start + " " + end);
			if (start == k && end == k)
				return ++i;
			if (start < end) {
				int mid = (start + end) / 2;
				if (mid < k)
					return mergeSort(mid + 1, end, k, ++i);
				else
					return mergeSort(start, mid, k, ++i);
			}
			// i is the no of times fn is called
			return i;
		}
	}
}
