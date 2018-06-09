package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FSQRT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- !=0 ) {
			int n = Integer.parseInt(br.readLine());
			int sqRoot = (int) Math.pow(n, 0.5);
			System.out.println(sqRoot);
		}
	}
}
