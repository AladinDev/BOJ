package com.boj;

import java.util.*;

public class Boj_1157 {

	public static void main(String[] args) {
		int[] cntAlpha = new int[26];
		int max = 0;
		int findIndex = 0;
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		for(int i = 0 ; i < inputStr.length() ; i++) {
			char charAt = inputStr.charAt(i);
			
			if(charAt >= 97) {
				cntAlpha[charAt - 32 - 65]++;		//º“πÆ¿⁄∏È 32 ª©¡÷∞Ì 65ª©¡‹
			} else {
				cntAlpha[charAt - 65]++;
			}
		}
		
		for(int i = 0 ; i < cntAlpha.length ; i++) {
			if(max < cntAlpha[i]) {
				max = cntAlpha[i];
				findIndex = i;
			}
		}
		int cnt = 0;
		
		for(int i = 0 ; i < cntAlpha.length ; i++) {
			if(cntAlpha[i] == max) cnt++;
		}
		char findChar = (char) (findIndex + 65);
		
		if(cnt >= 2) System.out.println("?");
		else System.out.println(findChar);
	}
}