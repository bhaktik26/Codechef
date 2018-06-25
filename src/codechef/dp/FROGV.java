package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class FROGV {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tk1.nextToken());
		int k = Integer.parseInt(tk1.nextToken());
		int p = Integer.parseInt(tk1.nextToken());
		List<Integer> coordinates = new ArrayList<>();
		StringTokenizer tk2 = new StringTokenizer(br.readLine());
		while (tk2.hasMoreTokens())
			coordinates.add(Integer.parseInt(tk2.nextToken()));
		while (p-- != 0) {
			int j;
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			if (Math.abs(coordinates.get(a - 1) - coordinates.get(b - 1)) <= k)
				System.out.println("Yes");
			else {
				int val1 = coordinates.get(a-1);
				int val2 = coordinates.get(b-1);
				coordinates.sort(Comparator.naturalOrder());
				for (j = coordinates.indexOf(val1); j <= coordinates.indexOf(val2) - 1; j++) {
					if (Math.abs(coordinates.get(j) - coordinates.get(j + 1)) <= k)
						continue;
					else
						break;
				}
				if (j == coordinates.indexOf(val2))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}
