import java.io.*;
import java.util.*;

public class blist {
	static Scanner in;
	static PrintWriter out;
	static int numCows;
	static int [] a, s, e, b;

	public static void main(String[] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException {
		in = new Scanner(new File("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		numCows = in.nextInt();
		a = new int [1001];
		s = new int [numCows];
		e = new int [numCows];
		b = new int [numCows];
	}
	
	private static void solve() throws IOException {
		for(int i = 0; i < numCows; i++) {
			s[i] = in.nextInt();
			e[i] = in.nextInt();
			b[i] = in.nextInt();
			for(int j = s[i]; j <= e[i]; j++) {
				a[j] += b[i];
			}
		}
		Arrays.sort(a);
		out.print(a[1000] + "\n");
	}
}