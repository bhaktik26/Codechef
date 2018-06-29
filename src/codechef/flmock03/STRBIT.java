package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://discuss.codechef.com/questions/66425/strbit-editorial
// https://www.codechef.com/viewsolution/15505304
// https://www.codechef.com/viewsolution/6918816
public class STRBIT {

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int k = Integer.parseInt(tk.nextToken());
			String str = br.readLine();
			if (str.chars().allMatch(i -> i == 'G')) {
				System.out.println(0);
			} else {
				char[] arr = str.toCharArray();
				char[] newArr = new char[arr.length + 1];
				newArr[0] = '$';
				for (int p = 0; p < arr.length; p++)
					newArr[p + 1] = arr[p];
				paint(newArr, str.indexOf('R') + 1, n + 1, k, str);
			}
		}
	}

	private static void paint(char[] newArr, int indexOfR, int length, int k, String str) {
		int i;
		count += 1;
		for (i = indexOfR; i <= Math.min(length, indexOfR + k - 1) && i < length; i++) {
			if (newArr[i] == 'R')
				newArr[i] = 'G';
			else
				newArr[i] = 'R';
		}
		str = String.valueOf(newArr);
		// System.out.println(str);
		if (str.substring(1).chars().allMatch(t -> t == 'G')) {
			System.out.println(count);
		} else
			paint(newArr, str.indexOf('R'), length, k, str);
	}
}
