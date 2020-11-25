package boj_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj_2908 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine());
		
		System.out.println(inputNum);
		
			while(inputNum != 0) {
				System.out.println(inputNum % 10);
				inputNum /= 10;
			}
	}
}


//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//String[] inputNum = br.readLine().split(" ");
//
//int inputNum1 = Integer.parseInt(inputNum[0]);
//int inputNum2 = Integer.parseInt(inputNum[1]);
//
//inputNum1 = (inputNum1 % 100 % 10) * 100 + (inputNum1 % 100 / 10) * 10 + (inputNum1 / 100 );
//inputNum2 = (inputNum2 % 100 % 10) * 100 + (inputNum2 % 100 / 10) * 10 + (inputNum2 / 100 );
//
//System.out.println(inputNum1 > inputNum2 ? inputNum1 : inputNum2);