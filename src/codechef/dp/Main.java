package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 
 * @author BHARAT FROGV
 */
public class Main {

	static Reader reader = new Reader();

	public static void main(String[] args) {

		int n = reader.nextInt();
		int k = reader.nextInt();
		int p = reader.nextInt();
		List<Integer> array = readArray(n);

		Map<Integer, Integer> groupInfo = new HashMap<>();
		List<Integer> tempArray = new ArrayList<>(array);
		tempArray.sort(Integer::compareTo);

		int groupNo = 1;
		groupInfo.put(tempArray.get(0), groupNo);
		for (int i = 1; i < n; i++) {
			if (tempArray.get(i) - tempArray.get(i - 1) > k) {
				groupNo++;
			}
			groupInfo.put(tempArray.get(i), groupNo);
		}

		for (int i = 0; i < p; i++) {
			int a = reader.nextInt();
			int b = reader.nextInt();

			if ((int) groupInfo.get(array.get(a - 1)) == groupInfo.get(array.get(b - 1))) {
				println("Yes");
			} else {
				println("No");
			}
		}

	}

	private static void print(String t) {
		System.out.print(t);
	}

	private static void println(String t) {
		System.out.println(t);
	}

	private static List readArray(int n) {
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			array.add(reader.nextInt());
		}
		return array;
	}

	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		private String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}

}
