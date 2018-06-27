package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SIMPSTAT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk1.nextToken());
			int k = Integer.parseInt(tk1.nextToken());
			int no[] = new int[n];
			int i = 0;
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			while (tk2.hasMoreTokens()) {
				no[i] = Integer.parseInt(tk2.nextToken());
				i++;
			}
			Arrays.sort(no);
			int sum = 0;
			// dont consider the lowest and highest k nos, obtained after
			// sorting
			for (i = k; i < n - k; i++)
				sum = sum + no[i];
			double avg = (double) sum / (n - 2 * k);
			// set precision
			DecimalFormat dec = new DecimalFormat("#0.000000");
			System.out.println(dec.format(avg));

		}
	}
}
