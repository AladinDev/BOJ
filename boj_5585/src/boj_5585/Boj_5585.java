package boj_5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5585 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int change = 1000 - Integer.parseInt(br.readLine());
		int cntSum = 0;
		int[] changeCnt = { 500, 100, 50, 10, 5, 1 };
		int i = 0;
		
		while(change != 0) {
			while(change / changeCnt[i] != 0) {
				cntSum += change / changeCnt[i];
				change %= changeCnt[i];
			}
			i++;
		}
		System.out.println(cntSum);
	}
}
