package boj_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5622 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		int[] cntAlpha = new int[26];
		
		int sec = 0;
		int dSec = 2;
		
		
		for(int i = 0 ; i < str.length() ; i++) {
			cntAlpha[str.charAt(i) - 65]++;
		}
		
		for(int i = 0 ; i < cntAlpha.length ; i++) {
			if(i < 3) sec += cntAlpha[i] * 3;
			else if(i < 6) sec += cntAlpha[i] * 4;
			else if(i < 9) sec += cntAlpha[i] * 5;
			else if(i < 12) sec += cntAlpha[i] * 6;
			else if(i < 15) sec += cntAlpha[i] * 7;
			else if(i < 19) sec += cntAlpha[i] * 8;
			else if(i < 22) sec += cntAlpha[i] * 9;
			else if(i < 26) sec += cntAlpha[i] * 10;
		}
		System.out.println(sec);
	}
}

//
//public static void main(String[] args) throws NumberFormatException, IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	String str = br.readLine();
//
//	int[] cntAlpha = new int[26];
//	
//	int sec = 0;
//	int dSec = 2;
//	
//	
//	for(int i = 0 ; i < str.length() ; i++) {
//		cntAlpha[str.charAt(i) - 65]++;
//	}
//	
//	for(int i = 0 ; i < cntAlpha.length ; i++) {
//		if(i < 3) sec += cntAlpha[i] * 3;
//		else if(i < 6) sec += cntAlpha[i] * 4;
//		else if(i < 9) sec += cntAlpha[i] * 5;
//		else if(i < 12) sec += cntAlpha[i] * 6;
//		else if(i < 15) sec += cntAlpha[i] * 7;
//		else if(i < 19) sec += cntAlpha[i] * 8;
//		else if(i < 22) sec += cntAlpha[i] * 9;
//		else if(i < 26) sec += cntAlpha[i] * 10;
//	}
//	System.out.println(sec);
//}
