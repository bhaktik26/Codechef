package codechef.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
// geeks 
public class Occurences {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk1.nextToken());
			int k = Integer.parseInt(tk1.nextToken());
			List<Integer> noList = new ArrayList<>();
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			while(tk2.hasMoreTokens())
				noList.add(Integer.parseInt(tk2.nextToken()));
			if(noList.contains(k))
				System.out.println(noList.indexOf(k)+ " " + noList.lastIndexOf(k));	
			else 
				System.out.println("-1");
		}
	}
}
