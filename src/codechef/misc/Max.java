package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
// geeks
public class Max {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			List<Integer> noList = new ArrayList<>();
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			while (tk2.hasMoreTokens())
				noList.add(Integer.parseInt(tk2.nextToken()));
			System.out.println(noList.stream().mapToInt(i -> i).max().getAsInt());
		}
	}
}