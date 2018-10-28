package codechef.octlunchtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class MAXPRODU {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			List<Integer> numbers = new ArrayList<>();
			int i = 1;
			while (i <= n) {
				numbers.add(i);
				i++;
			}
			List<Set<Integer>> possibleSets = getSubsets(numbers, k);
			int r = findSetsWithSumAsN(possibleSets, n);
			if (r == -1)
				System.out.println(-1);
			else
				System.out.println(r);
		}
	}

	public static List<Set<Integer>> getSubsets(List<Integer> numbers, int k) {
		List<Set<Integer>> res = new ArrayList<>();
		getSubsets(numbers, k, 0, new HashSet<Integer>(), res);
		return res;
	}

	private static void getSubsets(List<Integer> numbers, int k, int idx, Set<Integer> current,
			List<Set<Integer>> result) {
		if (current.size() == k) {
			result.add(new HashSet<>(current));
			return;
		}
		if (idx == numbers.size())
			return;
		Integer x = numbers.get(idx);
		current.add(x);
		getSubsets(numbers, k, idx + 1, current, result);
		current.remove(x);
		getSubsets(numbers, k, idx + 1, current, result);
	}

	public static int findSetsWithSumAsN(List<Set<Integer>> possibleSets, int n) {
		int maxProd = Integer.MIN_VALUE;
		for (Set<Integer> set : possibleSets) {
			int sum = set.stream().mapToInt(i -> i).sum();
			if (sum == n) {
				int prod = findMaxProduct(set);
				if (prod > maxProd)
					maxProd = prod;
			}
		}
		return maxProd;
	}

	private static int findMaxProduct(Set<Integer> set) {
		int prod = 1;
		for (int i : set) {
			prod = prod * (i * i - i);
		}
		return prod;
	}
}
