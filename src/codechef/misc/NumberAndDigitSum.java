package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// geeks 
public class NumberAndDigitSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long n = Integer.parseInt(tk.nextToken());
			long k = Integer.parseInt(tk.nextToken());
			long low = 0;
			long high = n - 1;
			while(low<=high) {
				long mid = (low + high )/2;
				if(mid - findSumOfDigits(mid) < k)
					low = mid + 1;
				else 
					high = mid - 1;
			}
			System.out.println(n - high);
		}
	}

	private static int findSumOfDigits(long n) {
		return String.valueOf(n).chars().map(Character::getNumericValue).sum();
	}

}
