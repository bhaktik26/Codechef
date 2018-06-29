package codechef.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// gfg
public class LongestWordSentence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			List<String> list = new ArrayList<>();
			while(tk.hasMoreTokens())
				list.add(tk.nextToken());
			long max = Long.MIN_VALUE;
			for(int i = 0; i < list.size(); i++) {
				long count = list.get(i).chars().count();
				if(count>max)
					max = count;
			}
			System.out.println(max);					
		}
	}
}
