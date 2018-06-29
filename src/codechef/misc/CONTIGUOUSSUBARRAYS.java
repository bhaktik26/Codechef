package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// gfg
public class CONTIGUOUSSUBARRAYS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			List<Integer> list = new ArrayList<>();
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			while (tk1.hasMoreTokens())
				list.add(Integer.parseInt(tk1.nextToken()));
			int count = 0;
			int i = 1;
			while (i <= n) {
				int j = 0;
				while (j <= n - i) {
					// list.subList gives list of size i
					// for n = 4 and original array (1,2,3,4)
					// for i = 1, we get sublists as 1, 2, 3, 4
					// for i = 2, we get sublists of size 2 as (1,2), (2,3),
					// (3,4)
					// for i = 3, (1,2,3) and (2,3,4)
					// and for i = 4, (1,2,3,4)
					if (isGreaterSublist(list.subList(j, j + i), k))
						count++;
					j++;
				}
				i++;
			}
			System.out.println(count);
		}

	}

	private static boolean isGreaterSublist(List<Integer> subList, int k) {
		int product = subList.stream().reduce(1, (a, b) -> a * b);
		if (product <= k)
			return true;
		else
			return false;
	}
}
