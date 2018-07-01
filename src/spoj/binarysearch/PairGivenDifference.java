package spoj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// gfg
public class PairGivenDifference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int len = Integer.parseInt(tk.nextToken());
			int diff = Integer.parseInt(tk.nextToken());

			int arr[] = new int[len];
			int i = 0;
			StringTokenizer tk1 = new StringTokenizer(br.readLine());
			while (tk1.hasMoreTokens()) {
				arr[i] = Integer.parseInt(tk1.nextToken());
				i++;
			}
			Arrays.sort(arr);
			int flag = 0;
			for (i = 0; i < len; i++) {
				flag = binSearch(arr, i+1, len - 1, diff, arr[i]);
				if (flag == 1) {
					System.out.println(1);
					break;
				}
			}
			if(flag==0) 
				System.out.println(-1);

		}
	}

	private static int binSearch(int[] arr, int start, int end, int diff, int no) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (Math.abs(no - arr[mid]) == diff)
				return 1;
			else if (Math.abs(no - arr[mid]) < diff)
				return binSearch(arr, mid + 1, end, diff, no);
			return binSearch(arr, start, mid - 1, diff, no);

		}
		return 0;
	}
}


/*
 * 
 * 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int T,x,n,d,i,k,j;
		T=in.nextInt();
		for(x=1;x<=T;x++)
		{
		    k=0;
		    n=in.nextInt();
		    d=in.nextInt();
		    int m[]=new int[n];
		    for(i=0;i<n;i++)
		    m[i]=in.nextInt();
		    for(i=0;i<n;i++)
		    {
		        for(j=i+1;j<n;j++)
		        {
		            if(Math.abs(m[i]-m[j])==d)
		            {
		                k=1;
		                break;
		            }
		        }
		    }
		    if(k==1)
		    System.out.println("1");
		    else
		    System.out.println("-1");
		    
		}
	}
}
 */
