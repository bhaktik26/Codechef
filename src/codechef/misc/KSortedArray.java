package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// geeks 
public class KSortedArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			// n - size of array
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int arr[] = new int[n];
			int i = 0;
			while (tk.hasMoreTokens()) {
				arr[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			// store the original array in another array
			int arr2[] = arr.clone();
			// sort the original array
			Arrays.sort(arr);
			int k = Integer.parseInt(br.readLine());

			// compare the indexes of the original and sorted array
			for (i = 0; i < n; i++) {
				int index = Arrays.binarySearch(arr, arr2[i]);
				if (Math.abs(index - i) <= k)
					continue;
				else
					break;
			}
			if (i == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
