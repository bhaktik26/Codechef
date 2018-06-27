package codechef.flmock04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SUBINC {

	static int k;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			List<Integer> list = new ArrayList<>();
			while (tk.hasMoreTokens())
				list.add(Integer.parseInt(tk.nextToken()));
			int count = 0;
			int i = 1;
			while (i <= n) {
				int j = 0;
				while (j <= n - i) {
					if (isSortedSublist(list.subList(j, j + i)))
						count++;
					j++;
				}
				i++;
			}
			System.out.println(count);
		}

	}

	private static boolean isSortedSublist(List<Integer> subList) {
		if (subList.size() == 1)
			return true;
		for (k = 0; k < subList.size() - 1; k++) {
			if (subList.get(k) > subList.get(k + 1))
				break;
		}
		if (k == subList.size() - 1)
			return true;
		return false;
	}
}
