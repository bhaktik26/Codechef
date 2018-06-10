package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OptimizedCHEFST {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			// n1 is no of stones in first pile
			long n1 = Long.parseLong(tk.nextToken());
			// n2 is no of stones in second pile
			long n2 = Long.parseLong(tk.nextToken());
			long m = Long.parseLong(tk.nextToken());
			// m is the max no of stones. no of stones that can be picked are
			// 1,2..m i.e. m(m+1)/2
			// max no of stones tht can be removed will be min of n1, n2,
			// m(m+1)/2
			long x = Math.min(Math.min(n1, n2), m * (m + 1) / 2);
			// 2x bcoz x stones are removed from each pile
			System.out.println(n1 + n2 - 2 * x);
		}
	}
}
