package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEFST {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long n1 = Long.parseLong(tk.nextToken());
			long n2 = Long.parseLong(tk.nextToken());
			long m = Long.parseLong(tk.nextToken());
			while (m > 0) {
				if ((n1 - m) >= 0 && (n2 - m) >= 0) {
					if (n1 < n2 && m > n1)
						m = n1;
					if (n2 < n1 && m > n2)
						m = n2;
					n1 = n1 - m;
					n2 = n2 - m;
				}
				m = m - 1;
			}
			System.out.println(n1+n2);
		}
	}
}
