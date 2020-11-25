package boj_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int result = 0;
		int first = 0;
		
		String[] splitMinus = br.readLine().split("\\-");
		String[] splitPlus = splitMinus[0].split("\\+");
		String[] tmp = null;
		for(String c : splitPlus) {
			first += Integer.parseInt(c);
		}
		
		for(int i = 1 ; i < splitMinus.length ; i++) {
			tmp = splitMinus[i].split("\\+");
		}
		
		for(int i = 0 ; i < tmp.length ; i++) {
			result += Integer.parseInt(tmp[i]);
			//System.out.print(tmp[i] + " ");
		}
		
		System.out.println(first - result);
	}
}
