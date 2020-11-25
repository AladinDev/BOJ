package boj_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		Boolean[] array = new Boolean[10001];
		
		int sum = 0;
		array[0] = false;
		array[1] = false;
		
		for(int i = M ; i <= N ; i++) array[i] = false;
		
		for(int i = M ; i <= N ; i++) {
			for(int j = 2 ; i * j <= N ; j++) {
				array[i * j] = true;
			}
		}
		for(int i = M ; i <=N ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(array[0]);
	}
}

//
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//int M = Integer.parseInt(br.readLine());
//int N = Integer.parseInt(br.readLine());
//int sum = 0;
//
//int min = N;
//
//while(M <= N) {
//	int n = 1;
//	int cnt = 0;
//	
//	while(n <= M) {
//		if(M % n == 0) cnt++;
//		n++;
//	}
//	if(cnt == 2) {
//		sum += M;
//		if(min >= M) min = M;
//	}
//	M++;
//}
//if(sum == 0) {
//	System.out.println(-1);
//	return;
//}
//
//System.out.println(sum);
//System.out.println(min);
