package codechef.flmock03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MANYCHEF {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String str = br.readLine();
			char arr[] = str.toCharArray();
			int len = str.length() - 1;
			// start checking from last element of array
			while (len >= 0) {
				if ((len - 3 >= 0) && (arr[len - 3] == 'C' || arr[len - 3] == '?')
						&& (arr[len - 2] == 'H' || arr[len - 2] == '?') && (arr[len - 1] == 'E' || arr[len - 1] == '?')
						&& (arr[len] == 'F' || arr[len] == '?')) {
					arr[len - 3] = 'C';
					arr[len - 2] = 'H';
					arr[len - 1] = 'E';
					arr[len] = 'F';
					len = len - 4;
				} else {
					if (arr[len] == '?')
						arr[len] = 'A';
					len = len - 1;
				}

			}
			System.out.println(String.valueOf(arr));
		}
	}
}
