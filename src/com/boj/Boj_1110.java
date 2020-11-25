package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj_1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] splitNum = new int[2];
		
		int inputNum = Integer.parseInt(br.readLine());
		int sum = inputNum;
		int newNum;
		int cycle = 0;
		
		if(inputNum < 10) {
			splitNum[0] = 0;
			splitNum[1] = inputNum;
		} else {
			splitNum[0] = inputNum / 10;
			splitNum[1] = inputNum % 10;
		}
		while(true) {
			sum = splitNum[0] + splitNum[1];
			
			splitNum[0] = splitNum[1];
			splitNum[1] = sum % 10;
			cycle++;
			
			if( ((splitNum[0] * 10) + splitNum[1]) == inputNum) {
				System.out.println(cycle);
				break;
			}
		}
	}
}


//Scanner sc = new Scanner(System.in);
//int cycle = 0;
//
//String N = sc.nextLine();
//
//String tmpN = N;
//int sumN = 0;
//String newN = " ";
//String lN;
//String rN;
//
//while (true) {
//	if (newN != " ") tmpN = newN;
//	// 10보다 작은 경우(최초 1회)
//	if (StoI(tmpN) < 10) {
//		tmpN = Character.toString('0') + tmpN; // 04만들고
//		sumN = Integer.parseInt(s)tmpN.charAt(1); // 0 + 4 = 4, 4저장 Int
//		rN = Character.toString(tmpN.charAt(1)); // '0''4'에서 4저장 오른쪽
//		newN = rN + Integer.toString(sumN);// '4'+'4' '44';
//
//		if (newN == (Character.toString('0') + N)) {
//			System.out.println(cycle);
//			break;
//		}
//		cycle++;
//
//	} else {
//		if(newN != " ") tmpN = newN;
//		lN = Character.toString(tmpN.charAt(0)); // 26일경우 2저장
//		rN = Character.toString(tmpN.charAt(1)); // 26일 경우 6저장
//		sumN = Integer.parseInt(lN) + Integer.parseInt(rN);
//		newN = lN + rN;
//		if (newN == N) {
//			System.out.println(cycle);
//			break;
//		}
//		cycle++;
//
//	}
//
//}
//
//}
//
//public static int StoI(String N) {
//return Integer.parseInt(N);
//}