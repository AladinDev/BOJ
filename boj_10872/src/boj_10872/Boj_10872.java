package boj_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj_10872 {
	static int result = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		
		System.out.println(fac(inputNum));
		
	}
	public static int fac(int inputNum) {
		if(inputNum <= 1) return 1;
		else return fac(inputNum - 1) * inputNum;
	}
}
