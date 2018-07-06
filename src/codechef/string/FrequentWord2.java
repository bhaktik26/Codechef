package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
// na
public class FrequentWord2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			List<String> list = new ArrayList<>();
			while (tk.hasMoreTokens()) {
				list.add(tk.nextToken());
			}
			list.sort(Comparator.naturalOrder());
			String str;
			for (int i = 0; i < list.size(); i++) {
				int count = 1;
				int max = Integer.MIN_VALUE;
				for (int j = 0; j < list.size() - 1; j++) {
					while (list.get(j) == list.get(j + 1)) {
						count++;
						str = list.get(j);
					}
					if (count > max)
						max = count;
				}
			}
		}

	}

}
