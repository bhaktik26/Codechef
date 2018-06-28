package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class STRBIT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			int j;
			int stepCount = 0;
			String str = br.readLine();
			if (str.chars().allMatch(i -> i == 'G')) {
				System.out.println(0);
			} else {
				char[] arr = str.toCharArray();
				for (j = str.indexOf('R'); j < str.length(); j++) {

				}
			}

		}

	}

}
