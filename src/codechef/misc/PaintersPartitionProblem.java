package codechef.misc;

import java.util.Scanner;

// geeks
public class PaintersPartitionProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int m = 0; m < test; m++) {
			int sub = in.nextInt();
			int size = in.nextInt();
			int[] wt = new int[size];
			for (int i = 0; i < size; i++)
				wt[i] = in.nextInt();
			if (sub > size) {
				int ans = 0;
				for (int i = 0; i < size; i++) {
					if (ans < wt[i])
						ans = wt[i];
				}
				System.out.println(ans);
				continue;
			}
			// constructing the table
			int memo[][] = new int[size + 1][sub + 1];
			for (int i = 1; i <= size; i++)
				memo[i][1] = memo[i - 1][1] + wt[i - 1];
			for (int i = 2; i <= size; i++) {
				for (int j = 2; j <= min(i, sub); j++) {
					int temp = 1;
					int row = i - temp;
					int prev = wt[i - 1];
					int min = (int) Math.pow(10, 9);
					while (memo[row][j - 1] != 0) {
						int val = max(memo[row][j - 1], prev);
						if (val < min)
							min = val;
						temp++;
						row = i - temp;
						prev += wt[i - temp];
					}
					memo[i][j] = min;
				}
			}
			System.out.println(memo[size][sub]);
		}
	}

	private static int min(int i, int j) {
		int ans = i < j ? i : j;
		return ans;

	}

	private static int max(int i, int j) {
		int ans = i > j ? i : j;
		return ans;
	}

}
