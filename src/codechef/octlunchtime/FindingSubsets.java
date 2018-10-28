package codechef.octlunchtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingSubsets {

	public static void main(String[] args) {
		List<Integer> superSet = new ArrayList<>();
		superSet.add(1);
		superSet.add(2);
		superSet.add(3);
		superSet.add(4);
		System.out.println(getSubsets(superSet, 2));
		// we get list of set by this, iterate over the list, check for sum = n
	

	}

	private static void getSubsets(List<Integer> superSet, int k, int idx, Set<Integer> current,
			List<Set<Integer>> solution) {
		if (current.size() == k) {
			solution.add(new HashSet<>(current));
			return;
		}
		if (idx == superSet.size())
			return;
		Integer x = superSet.get(idx);
		current.add(x);
		getSubsets(superSet, k, idx + 1, current, solution);
		current.remove(x);
		getSubsets(superSet, k, idx + 1, current, solution);
	}

	public static List<Set<Integer>> getSubsets(List<Integer> superSet, int k) {
		List<Set<Integer>> res = new ArrayList<>();
		getSubsets(superSet, k, 0, new HashSet<Integer>(), res);
		return res;
	}

}
