package codechef.fastmodulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHMOD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i;
		int arr[] = new int[n];
		StringTokenizer tk1 = new StringTokenizer(br.readLine());
		for(i=0;i<n;i++)
			arr[i] = Integer.parseInt(tk1.nextToken());
		int q = Integer.parseInt(br.readLine());
		while(q-- != 0) {
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(tk2.nextToken());
			int right = Integer.parseInt(tk2.nextToken());
			long modulo = Long.parseLong(tk2.nextToken());
			int result = 1;
			for(i=left-1;i<=right-1;i++)
				result = result * arr[i];
			System.out.println(result%modulo);		
		}
	}
}
