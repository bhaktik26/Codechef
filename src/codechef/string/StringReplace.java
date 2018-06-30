package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplace {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String str = br.readLine();
			char[] arr = str.toCharArray();
			int j = 0;
			for (int i = 0; i < arr.length; i++) {
				// check for valid characters and only store them starting from
				// j = 0 in arr
				if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')
						|| (arr[i] >= '0' && arr[i] <= '9')) {
					arr[j] = arr[i];
					j++;
				}
			}
			// valid string is from index 0 to j-1
			str = String.valueOf(arr).substring(0, j);
			// palindrome check
			if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
