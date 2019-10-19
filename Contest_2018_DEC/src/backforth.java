import java.io.*;
import java.util.*;

public class backforth {
	static Scanner in;
	static PrintWriter out;
	
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
		in = new Scanner(new File("backforth.in"));
		out = new PrintWriter(new File("backforth.out"));
	}
	
	private static void solve() throws IOException{
		
	}
}