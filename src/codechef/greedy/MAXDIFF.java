package codechef.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MAXDIFF {

     public static void main(String args[]) {
        int T, i,sum1,sum2;
        int a[] = new int[2];
        Integer w[];
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T != 0) {
            sum1=0;
            sum2=0;
         for(i=0;i<2;i++)
             a[i]=sc.nextInt();
         w=new Integer[a[0]];
         for(i=0;i<w.length;i++)
           w[i]=sc.nextInt();
       Arrays.sort(w, Comparator.reverseOrder());
            int min = a[1]<(a[0]-a[1])?a[1]:(a[0]-a[1]);
          for(i=0;i<a[0]-min;i++)
            sum1+=w[i];

          for(i=a[0]-min;i<a[0];i++)
            sum2+=w[i];
          System.out.println(sum1-sum2);
            
            T--;

        }
    }
}
