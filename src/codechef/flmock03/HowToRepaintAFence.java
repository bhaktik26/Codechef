package codechef.flmock03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class HowToRepaintAFence {
 
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter w = new PrintWriter(System.out);
	        
	    int t = ip(br.readLine());
	    
	    while(t-- > 0) {
	    	StringTokenizer st1 = new StringTokenizer(br.readLine());
	    	int n = ip(st1.nextToken());
	    	int k = ip(st1.nextToken());
	          
	        char a[] = br.readLine().toCharArray();
	        int swaps[] = new int[n];   
	        int total = 0;
	        
	        for(int i=0;i<n;i++){
	        	int disSwaps;
	        	if(i < k)	disSwaps = total;
	        	else	disSwaps = total - swaps[i-k];
	        	int state = ((a[i] == 'R' ? 1 : 0) + disSwaps ) % 2;
	        	if(i != 0)	swaps[i] = swaps[i-1];
	        	if(state == 1){
	        		total++;
	        		swaps[i]++;
	        	}
	        }
	        
	        w.println(total);
	    }
	        
	    w.close();
	        
	}
	
	public static int ip(String s){
		return Integer.parseInt(s);
	}
}
 