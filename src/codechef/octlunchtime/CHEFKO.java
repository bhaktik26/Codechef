package codechef.octlunchtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class CHEFKO {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken());
			int m = n;
			int k = Integer.parseInt(tk.nextToken());
			List<Set<Integer>> list = new ArrayList<>();
			while(m--!=0) {
				StringTokenizer tk1 = new StringTokenizer(br.readLine());
				Set<Integer> set = new HashSet<>();
				while(tk1.hasMoreTokens())
				set.add(Integer.parseInt(tk1.nextToken()));
				list.add(set);
			}
			
		}

	}

}
