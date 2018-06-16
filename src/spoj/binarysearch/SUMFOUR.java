package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SUMFOUR {
	static long cnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n - size of list
		int n = Integer.parseInt(br.readLine());
		int size = n;
		List<Long> a = new ArrayList<>();
		List<Long> b = new ArrayList<>();
		List<Long> c = new ArrayList<>();
		List<Long> d = new ArrayList<>();
		while (size-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			a.add(Long.parseLong(tk.nextToken()));
			b.add(Long.parseLong(tk.nextToken()));
			c.add(Long.parseLong(tk.nextToken()));
			d.add(Long.parseLong(tk.nextToken()));
		}
		// add all possible combinations of a and b lists
		int y = 0, z;
		int i = 0;
		long sumAB[] = new long[n * n];
		while (y < n) {
			z = 0;
			while (z < n) {
				sumAB[i] = a.get(y) + b.get(z);
				i++;
				z++;
			}
			y++;
		}

		// now similarly add all possible combinations of list c and d
		y = 0;
		i = 0;
		long sumCD[] = new long[n * n];
		while (y < n) {
			z = 0;
			while (z < n) {
				sumCD[i] = c.get(y) + d.get(z);
				i++;
				z++;
			}
			y++;
		}
		Arrays.sort(sumCD);
		for (i = 0; i < n * n; i++) {
			binSearch(sumCD, 0, n * n - 1, (-1) * sumAB[i]);
		}
		System.out.println(cnt);
	}

	private static void binSearch(long[] sumCD, int low, int high, long value) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (sumCD[mid] == value) {
				long noOfTimes = Arrays.stream(sumCD).filter(p -> p == value).count();
				cnt = cnt + noOfTimes;
			} else if (value < sumCD[mid])
				binSearch(sumCD, low, mid - 1, value);
			else
				binSearch(sumCD, mid + 1, high, value);
		}
	}
}
