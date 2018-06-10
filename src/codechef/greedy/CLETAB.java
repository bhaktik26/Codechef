package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CLETAB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			// n - no of tables, m - no of customer orders
			int n = Integer.parseInt(tk.nextToken());
			int m = Integer.parseInt(tk.nextToken());
			List<Integer> list = new ArrayList<>();
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			while (tk2.hasMoreTokens())
				list.add(Integer.parseInt(tk2.nextToken()));
			int minCount = 0;

		}
	}
}
