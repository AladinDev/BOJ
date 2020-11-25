package boj_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11047 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N, K;
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		int i = coin.length - 1;
		int cnt = 0;
		
		for(int j = 0 ; j < coin.length ; j++) {
			coin[j] = Integer.parseInt(br.readLine());
		}
		
		while(K != 0) {
			while(K / coin[i] != 0) {
				cnt += K / coin[i];
				K %= coin[i];
			}
			i--;
		}		
		System.out.println(cnt);
	}
}
