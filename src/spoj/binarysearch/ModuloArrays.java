package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ModuloArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			Integer arr[] = new Integer[n];
			int i = 0;
			while (tk1.hasMoreTokens()) {
				arr[i] = Integer.parseInt(tk1.nextToken());
				i++;
			}
			// sort the nos in reverse order since the condn in problem is
			// arr[i]>=arr[j]
			Arrays.sort(arr, Comparator.reverseOrder());
			int max = Integer.MIN_VALUE;
			for (i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					int modulo = arr[i] % arr[j];
					if (modulo > max)
						max = modulo;
				}
			}
			System.out.println(max);
		}
	}
}
