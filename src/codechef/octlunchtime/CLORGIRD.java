package codechef.octlunchtime;

import java.util.Scanner;

public class CLORGIRD {

	static int colored[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char a[][] = new char[n][m];
			colored = new int[n][m];
			for (int i = 0; i < n; i++) {
				a[i] = sc.next().toCharArray();
				for (int j = 0; j < m; j++) {
					if (a[i][j] == '#')
						colored[i][j] = 1;
				}
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < m - 1; j++) {
					if (a[i][j] == '.') {
						if (a[i][j + 1] == '.' && a[i + 1][j] == '.' && a[i + 1][j + 1] == '.') {
							colored[i][j] = 1;
							colored[i][j + 1] = 1;
							colored[i + 1][j] = 1;
							colored[i + 1][j + 1] = 1;
						}
					}
				}
			}
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (colored[i][j] == 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
