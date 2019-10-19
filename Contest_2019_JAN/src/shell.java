import java.util.*;
import java.io.*;

public class shell {
	static Scanner in;
	static PrintWriter out;
	static int numSwaps, score, max;
	static int [] shells, one, two, guess;
	
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
	
	//getting data and organizing
	private static void init() throws IOException{
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		numSwaps = in.nextInt();
		score = 0;
		one = new int[numSwaps];
		two = new int[numSwaps];
		guess = new int[numSwaps];
		for(int i = 0; i < numSwaps; i++) {
			one[i] = in.nextInt() - 1;
			two[i] = in.nextInt() - 1;
			guess[i] = in.nextInt() - 1;
		}
	}
	
	private static void solve() throws IOException{
		for(int i = 0; i < 3; i++) {
			reset(i);
			game();
			max = Math.max(score, max);
		}
		out.println(max);
	}
	
	private static void reset(int i) {
		shells = new int[3];
		shells[i] = 1;
		score = 0;
	}
	
	private static int game() {
		for(int i = 0; i < numSwaps; i++) {
			int temp = shells[one[i]];
			shells[one[i]] = shells[two[i]];
			shells[two[i]] = temp;
			if(shells[guess[i]] == 1) {
				score++;
			}
		}
		return score;
	}
}