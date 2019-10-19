import java.util.*;
import java.io.*;

public class guess {
	static Scanner in;
	static PrintWriter out;
	static ArrayList<String>[] a;
	static int n;
	
	public static void main(String [] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException{
		in = new Scanner(new File("guess.in"));
		out = new PrintWriter(new File("guess.out"));
		
		n = in.nextInt();
		a = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<String>();
			in.next();
			int k = in.nextInt();
			for(int j = 0; j < k; j++) {
				a[i].add(in.next());
			}
		}
	}
	
	private static void solve() throws IOException{
		int max = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				int same = 0;
				for(String p : a[i]) {
					if(a[j].contains(p)) {
						same++;
					}
				}
				max = Math.max(max, same);
			}
		}
		out.println(max + 1);
	}
}