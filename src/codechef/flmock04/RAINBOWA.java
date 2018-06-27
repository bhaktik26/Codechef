package codechef.flmock04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// gives wrong ans for one case 
public class RAINBOWA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int no[] = new int[n];
			int i = 0, j;
			while (tk.hasMoreTokens()) {
				no[i] = Integer.parseInt(tk.nextToken());
				i++;
			}
			int max = Arrays.stream(no).max().getAsInt();
			if (max != 7)
				System.out.println("no");
			else {
				if (n % 2 != 0) {
					int mid = (n - 1) / 2;
					if (no[mid] != 7)
						System.out.println("no");
					else {
						for (j = 0; j < mid; j++) {
							if ((no[j + 1] - no[j] == 0 || (no[j + 1] - no[j]) == 1) && no[0] == 1 && no[n - 1] == 1
									&& no[j] == no[n - j - 1] && no[j] < 7)
								continue;
							else
								break;
						}
						if (j == mid)
							System.out.println("yes");
						else
							System.out.println("no");
					}
				} else {
					int mid = n / 2;
					if (no[mid] != 7)
						System.out.println("no");
					else if (no[mid] != 7 && no[mid - 1] != 7)
						System.out.println("no");
					else {
						for (j = 0; j < mid - 1; j++) {
							if ((no[j + 1] - no[j] == 0) || (no[j + 1] - no[j] == 1) && no[0] == 1 && no[n - 1] == 1
									&& no[j] == no[n - j - 1] && no[j] < 7)
								continue;
							else
								break;
						}
						if (j == mid - 1)
							System.out.println("yes");
						else
							System.out.println("no");
					}
				}
			}

		}
	}
}
