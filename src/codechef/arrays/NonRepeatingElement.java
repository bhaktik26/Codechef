package codechef.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class NonRepeatingElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			HashMap<Integer, Integer> map = new LinkedHashMap<>();
			while (tk.hasMoreTokens()) {
				int key = Integer.parseInt(tk.nextToken());
				if (map.containsKey(key))
					map.put(key, map.get(key) + 1);
				else
					map.put(key, 1);
			}
			int i;
			// store all keys of map in a list
			List<Integer> list = map.keySet().stream().collect(Collectors.toList());
			for (i = 0; i < list.size(); i++) {
				// key whose count = 1
				if (map.get(list.get(i)) == 1) {
					System.out.println(list.get(i));
					break;
				}
			}
			if (i == list.size())
				System.out.println(0);
		}
	}
}
