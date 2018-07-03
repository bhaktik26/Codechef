package codechef.arrays;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TADELIVE solver = new TADELIVE();
		solver.solve(1, in, out);
		out.close();
	}

	static class TADELIVE {
		public void solve(int testNumber, FastInput in, PrintWriter out) {
			int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();

			int[] arr1 = in.intarr(n);
			int[] arr2 = in.intarr(n);

			ArrayList<TADELIVE.Pair> pr = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				TADELIVE.Pair p = new TADELIVE.Pair(arr1[i], arr2[i], Math.abs(arr1[i] - arr2[i]));
				pr.add(p);

			}

			pr.sort(new TADELIVE.SortClass());
			int ans = 0;

			for (int i = 0; i < n; i++) {

				if (pr.get(i).v1 > pr.get(i).v2) {
					if (a > 0) {
						ans += pr.get(i).v1;
						a--;
					} else {
						ans += pr.get(i).v2;
						b--;
					}
				} else {
					if (b > 0) {
						ans += pr.get(i).v2;
						b--;
					} else {
						ans += pr.get(i).v1;
						a--;
					}
				}

			}

			out.println(ans);

		}

		private static class Pair {
			int v1 = 0;
			int v2 = 0;
			int v3 = 0;

			public Pair(int v1, int v2, int v3) {
				this.v1 = v1;
				this.v2 = v2;
				this.v3 = v3;
			}

		}

		private static class SortClass implements Comparator<TADELIVE.Pair> {

			public int compare(TADELIVE.Pair o1, TADELIVE.Pair o2) {
				return o2.v3 - o1.v3;
			}

		}

	}

	static class FastInput {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private FastInput.SpaceCharFilter filter;

		public FastInput(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public boolean isSpaceChar(int c) {
			if (filter != null) {
				return filter.isSpaceChar(c);
			}
			return isWhitespace(c);
		}

		public static boolean isWhitespace(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public int[] intarr(int n) {
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);

		}

	}
}