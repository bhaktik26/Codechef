package codechef.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

public class STICKS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			int no[] = new int[n];
			int i = 0;
			StringTokenizer tk = new StringTokenizer(br.readLine());
			while (tk.hasMoreTokens()) {
				no[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			// count the occurence of each element
			HashMap<Integer, Integer> countMap = new LinkedHashMap<>();
			for (i = 0; i < n; i++) {
				// if the element is present in the map, get the counter n
				// increment its value by 1
				if (countMap.containsKey(no[i]))
					countMap.put(no[i], countMap.get(no[i]) + 1);
				// else initialize the counter to 1
				else
					countMap.put(no[i], 1);
			}
			// from the map choose elements whose count is >=2 and add them to a
			// list
			List<Integer> list = new ArrayList<>();
			countMap.forEach((k, v) -> {
				// one value shud be present atleast twice, 2 sides are of same
				// length
				if (v >= 2)
					list.add(k);
				// ex : 2 3 1 2 2 2 (still can form a rectangle)
				if (v >= 4)
					list.add(k);
			});
			// sort the nos in reverse order and choose the first 2 for
			// calculating area(largest possible area)
			list.sort(Comparator.reverseOrder());
			// to make a rectangle need 2 sides
			if (list.size() >= 2)
				// area = l*b
				System.out.println(list.get(0) * list.get(1));
			else
				System.out.println("-1");
		}
	}
}
