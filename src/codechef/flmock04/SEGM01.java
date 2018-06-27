package codechef.flmock04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SEGM01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String s = br.readLine();
			char[] arr = s.toCharArray();
			// find the total no of 1's in the string
			long countOfOnes = s.chars().filter(i -> i == '1').count();
			// if there are no 1's, no need to check anything
			if (countOfOnes == 0) {
				System.out.println("NO");
			} else {
				long cntConsecutiveOnes = 0;
				long max = 0;
				// find the max no of consecutive 1's
				for (int i = 0; i < arr.length; i++) {
					cntConsecutiveOnes = 0;
					while (i < arr.length && arr[i] == '1') {
						cntConsecutiveOnes++;
						i++;
					}
					if (cntConsecutiveOnes >= max)
						max = cntConsecutiveOnes;
				}
				// if the max no of consecutive 1's is equal to total no of 1's
				// in the string
				if (countOfOnes == max)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
