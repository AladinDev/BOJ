package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
	
		int j = 1;
		int newI = 2;
		
		while(newI <= inputNum) {
			newI += 6 * j++;
		}
		System.out.println(j);
	}
}