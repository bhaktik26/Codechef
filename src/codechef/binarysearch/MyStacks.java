package codechef.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyStacks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			// n - no of discs
			int n = Integer.parseInt(br.readLine());
			int disc[] = new int[n];
			int i;
			// initialize to max value
			for (i = 0; i < n; i++)
				disc[i] = Integer.MAX_VALUE;
			StringTokenizer tk = new StringTokenizer(br.readLine());
			for (i = 0; i < n; i++) {
				int temp = Integer.parseInt(tk.nextToken());
				// find the index and store the next element in tht index
				int index = find(disc, 0, n - 1, temp);
				// store the element one by one as per the condn
				disc[index] = temp;
			}
			int count = 0;
			for (i = 0; i < n && disc[i] != Integer.MAX_VALUE; i++)
				count++;
			System.out.print(count + " ");
			for (i = 0; i < n && disc[i] != Integer.MAX_VALUE; i++)
				System.out.print(disc[i] + " ");
			System.out.println();
		}
	}

	// fn to find the index where next element shud be stored, based on binary
	// search, if element is smaller than mid, some index of left subarray will
	// be assigned and if its greater the index would be of right half
	private static int find(int[] disc, int i, int j, int temp) {
		if (i == j)
			return i;
		int mid = (i + j) / 2;
		if (temp >= disc[mid])
			return find(disc, mid + 1, j, temp);
		else
			return find(disc, i, mid, temp);
	}

}
