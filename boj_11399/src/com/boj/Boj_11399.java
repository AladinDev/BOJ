package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Boj_11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pNum = Integer.parseInt(br.readLine());
		int[] nTNum = new int[pNum];
		int sum = 0;
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 0 ; i < str.length ; i++) {
			nTNum[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(nTNum);
		sum = nTNum[0];
		
		for(int j = 1 ; j < nTNum.length ; j++) {
			nTNum[j] += nTNum[j-1];
			sum += nTNum[j];
		}
		
		System.out.println(sum);
	}
}
