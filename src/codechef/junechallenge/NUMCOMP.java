package codechef.junechallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMCOMP {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			int n = Integer.parseInt(tk.nextToken());

			double aN = Math.pow(a, n);
			double bN = Math.pow(b, n);

			if (aN > bN)
				System.out.println(1);
			if (aN < bN)
				System.out.println(2);
			if (aN == bN)
				System.out.println(0);
		}
	}
}
