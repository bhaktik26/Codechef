package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TACHSTCK {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tk1.nextToken());
		int d = Integer.parseInt(tk1.nextToken());
		int no[] = new int[n];
		int i = 0;
		while (i != n) {
			no[i] = Integer.parseInt(br.readLine());
			i++;
		}
		// sort nos in ascending order
		Arrays.sort(no);
		int j = 0;
		int cnt = 0;
		while (j < n - 1) {
			// check if difference between 2 nos is <=d
			if (no[j + 1] - no[j] <= d) {
				// if 2 consecutive nos form a pair increment j by 2
				j = j + 2;
				cnt++;
			} else
				j = j + 1;
		}
		System.out.println(cnt);
	}
}
