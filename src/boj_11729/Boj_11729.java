package boj_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11729 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int first = 1;
		int second = 2;
		int third = 3;
		
		hanoi(N, first, second, third);
		
	}
	
	public static void hanoi(int N, int f, int m, int t) {
		if(N == 1) {
			System.out.println(f + " " + t);
			return;
		}
		
		hanoi(N-1, f, t, m);
		
		System.out.println(f + " " + t);
		
		hanoi(N-1, m, f, t);
	}

}
