package codechef.junechallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NAICHEF {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- !=0 ) {
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk1.nextToken());
			int a = Integer.parseInt(tk1.nextToken());
			int b = Integer.parseInt(tk1.nextToken());
			List<Integer> facesList = new ArrayList<>();
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
		    while(tk2.hasMoreTokens())
			facesList.add(Integer.parseInt(tk2.nextToken()));
		    long countA = facesList.stream().filter(i -> i==a).count();
		    long countB = facesList.stream().filter(i -> i==b).count();
		    float prob = (float)countA/n * (float)(countB)/n;
		    DecimalFormat deci = new DecimalFormat("#0.0000000000");
		    System.out.println(deci.format(prob));
		}
	}
}
