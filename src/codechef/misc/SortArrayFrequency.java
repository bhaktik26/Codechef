package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * sort elements of array according to frequency and print them, if 2 elements
 * have same freq print the smaller one first
 *
 */
public class SortArrayFrequency {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			// n - size of array
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			HashMap<Integer, Integer> noMap = new LinkedHashMap<>();
			while (tk.hasMoreTokens()) {
				int key = Integer.parseInt(tk.nextToken());
				// if map contains tht key increment the value
				if (noMap.containsKey(key))
					noMap.put(key, noMap.get(key) + 1);
				// else initialize it to 1
				else
					noMap.put(key, 1);
			}

			// compare elements by key
			Comparator<? super Entry<Integer, Integer>> other = Map.Entry.comparingByKey();

			// sort the map first according to value(decreasing order) and then
			// according to key
			Map<Integer, Integer> sortedByValueDesc = noMap.entrySet().stream()
					.sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed().thenComparing(other))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
							LinkedHashMap::new));

			// iterate over the map
			for (int z = 0; z < sortedByValueDesc.size(); z++) {
				// set count to 0, till value of count is not equal to the map
				// value(count of tht particular no) print the key tht many
				// times
				int count = 0;
				// store all the keys of the map in a list
				List<Integer> lis = new ArrayList<Integer>(sortedByValueDesc.keySet());
				// print the key value no of times
				while (count != sortedByValueDesc.get(lis.get(z))) {
					System.out.print(lis.get(z) + " ");
					count++;
				}
			}
			System.out.println();
		}
	}
}
