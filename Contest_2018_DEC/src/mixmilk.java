import java.io.*;
import java.util.*;

public class mixmilk {

	static Scanner in;
	static PrintWriter out;
	static int c1, a1, c2, a2, c3, a3;

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
		in = new Scanner(new File("mixmilk.in"));
		out = new PrintWriter(new File("mixmilk.out"));

		c1 = in.nextInt();
		a1 = in.nextInt();
		c2 = in.nextInt();
		a2 = in.nextInt();
		c3 = in.nextInt();
		a3 = in.nextInt();
	}

	private static void solve() throws IOException {
		for (int i = 0; i < 33; i++) {
			// 1 -> 2
			if (a1 + a2 > c2) {
				a1 = (a1 + a2) - c2;
				a2 = c2;
			} else {
				a2 += a1;
				a1 = 0;
			}
			//2 -> 3
			if (a2 + a3 > c3) {
				a2 = (a2 + a3) - c3;
				a3 = c3;
			} else {
				a3 += a2;
				a2 = 0;
			}
			//3 -> 1
			if (a3 + a1 > c1) {
				a3 = (a3 + a1) - c1;
				a1 = c1;
			} else {
				a1 += a3;
				a3 = 0;
			}
		}
		if (a1 + a2 > c2) {
			a1 = (a1 + a2) - c2;
			a2 = c2;
		} else {
			a2 += a1;
			a1 = 0;
		}
		out.print(a1 + "\n" + a2 + "\n" + a3 + "\n");
	}

}