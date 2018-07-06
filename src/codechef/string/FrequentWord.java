package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.Map.Entry;

//gfg
public class FrequentWord {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			HashMap<String, Integer> map = new LinkedHashMap<>();
			while (tk.hasMoreTokens()) {
				String key = tk.nextToken();
				if (map.containsKey(key))
					map.put(key, map.get(key) + 1);
				else
					map.put(key, 1);
			}
			Comparator<? super Entry<String, Integer>> other = Map.Entry.comparingByKey();
			Map<String, Integer> sortedMap = map.entrySet().stream()
					.sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(other))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
							LinkedHashMap::new));
			System.out.println(sortedMap.keySet().stream().findFirst().get());

		}
	}
}
