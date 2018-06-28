package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SNAKEEAT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int q = Integer.parseInt(tk.nextToken());
			int[] snakesLength = new int[n];
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int i = 0;
			while (tk1.hasMoreTokens()) {
				snakesLength[i] = Integer.parseInt(tk1.nextToken());
				i++;
			}
			Arrays.sort(snakesLength);
			while (q-- != 0) {
				int k = Integer.parseInt(br.readLine());
				int indexOfFloor = floorSearch(snakesLength, 0, n - 1, k);
				int noOfSnakesToBeFed[] = new int[indexOfFloor + 1];
				int cnt = n - indexOfFloor - 1;
				for (i = indexOfFloor; i >= 0; i--) {
					noOfSnakesToBeFed[i] = k - snakesLength[i];
					if (noOfSnakesToBeFed[i] <= i) {
						cnt++;
						continue;
					} else
						break;
				}
				System.out.println(cnt);

			}
		}

	}

	private static int floorSearch(int[] snakesLength, int low, int high, int k) {
		if (low > high)
			return -1;
		// if last element is smaller than k, it will be floor, since its the
		// greatest element of the sorted array
		if (snakesLength[high] <= k)
			return high;
		int mid = (low + high) / 2;
		if (snakesLength[mid] == k)
			return mid;
		// k is between mid-1 and mid
		if (mid > 0 && k >= snakesLength[mid - 1] && k < snakesLength[mid])
			return mid - 1;
		// if k is less than mid than floor will be in lower half of array
		if (k < mid)
			return floorSearch(snakesLength, low, mid - 1, k);
		// if k > mid, floor will be in second half
		return floorSearch(snakesLength, mid + 1, high, k);
	}
}
