package codechef.flmock03;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
 
// snakeeat
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 48);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int[] array = new int[n];
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            long[] prefix = new long[n];
            for (int j = 0; j < n; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array);
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    prefix[j] = array[j];
                } else {
                    prefix[j] = prefix[j - 1] + array[j];
                }
            }
            for (int j = 0; j < q; j++) {
                long ans = 0;
                long k = Integer.parseInt(br.readLine());
                int x = binarySearch(array, (double) k - 0.5);
                int low = 0, high = x - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    long sum = prefix[x - 1] - prefix[x - mid - 1];
                    long product = mid * k;
                    long res = product - sum;
                    if (res <= x - mid) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                bw.write(ans + (n - x) + "\n");
            }
        }
        bw.flush();
    }
 
    private static int binarySearch(int[] array, double key) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] < key) {
                low = mid + 1;
            }
        }
        return low;
    }
}
 
