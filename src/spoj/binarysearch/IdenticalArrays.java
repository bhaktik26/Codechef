package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//gfg
public class IdenticalArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk1= new StringTokenizer(br.readLine());
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int i = 0;
			int a1[] = new int[n];
			int a2[] = new int[n];
			while(tk1.hasMoreTokens() && tk2.hasMoreTokens()) {
				a1[i] = Integer.parseInt(tk1.nextToken());
				a2[i] = Integer.parseInt(tk2.nextToken());
				i++;
			}
			Arrays.sort(a1);
			Arrays.sort(a2);
			if(Arrays.equals(a1, a2))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
