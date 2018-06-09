package codechef.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FRGTNLNG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int i, j;
			int n = sc.nextInt();
			int k = sc.nextInt();
			String[] words = new String[n];
			List<String> phrases;
			for (i = 0; i < n; i++)
				words[i] = sc.next();
			int cnt[] = new int[n];
		    for (i = 0; i < n; i++)
		    	cnt[i] = 0;
			for (j = 0; j < k; j++) {
				int l = sc.nextInt();
				phrases = new ArrayList<>();
			    
				for (i = 0; i < l; i++) {
					phrases.add(sc.next());
				}
				for (int p = 0; p < n; p++) {
					if(phrases.contains(words[p]))
						cnt[p]++;
				}
			}
			for (i = 0; i < n; i++) {
				if(cnt[i] > 0)
					System.out.print("YES ");
				else
					System.out.print("NO ");
			}
			System.out.println();
		}
	}
}
