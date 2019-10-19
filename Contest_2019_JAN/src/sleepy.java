import java.util.*;
import java.io.*;

public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static int numCows, moves;
	static int [] cows;
	
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
		in = new Scanner(new File("sleepy.in"));
		out = new PrintWriter(new File("sleepy.out"));
		numCows = in.nextInt();
		cows = new int[numCows];
		for(int i = 0; i < numCows; i++) {
			cows[i] = in.nextInt();
		}
		moves = 0;
	}
	
	private static void solve() throws IOException{
		for(int i = numCows - 1; i > 0; i--) {
			if(cows[i - 1] > cows[i]) {
				moves = i;
				break;
			}
		}
		out.println(moves);
	}
}