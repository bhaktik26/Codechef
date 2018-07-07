package codechef.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// wrong 
public class NumberOfPaths {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int rows = Integer.parseInt(tk1.nextToken());
			int col = Integer.parseInt(tk1.nextToken());
			if(col==1 || rows == 1) {
				System.out.println(1);
				break;
			}
			int paths = (rows - 1) * col;
			System.out.println(paths);

		}
	}
}
