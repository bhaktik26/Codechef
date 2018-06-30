package codechef.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COMPILER {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String s = br.readLine();
			char[] arr = s.toCharArray();
			int cnt = 0, ans = 0;
			for (int i = 0; i < s.length(); i++) {
				if (arr[i] == '<')
					cnt++;
				else {
					cnt--;
					// for every < there shud be >
					if (cnt == 0)
						ans = Math.max(ans, i + 1);
					else if (cnt < 0)
						break;
				}
			}
			System.out.println(ans);
		}
	}
}
