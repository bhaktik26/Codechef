package codechef.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MATRIX2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int m = Integer.parseInt(tk.nextToken());
		int i, j;
		int count = 0;
		char matrix[][] = new char[n][m];
		char[] row = new char[m];
		for (i = 0; i < n; i++) {
			String values = br.readLine();
			row = values.toCharArray();
			for (j = 0; j < m; j++) {
				matrix[i][j] = row[j];
				if (matrix[i][j] == '1')
					count += 1;
			}
		}
		for (i = 0; i < n - 1; i++) {
			for (j = i; j < m - 1; j++) {
				if (matrix[i][j] == '1' && matrix[i][j + 1] == '1' && matrix[i + 1][j + 1] == '1')
					count += 1;
			}
		}
		System.out.println(count);
	}
}
