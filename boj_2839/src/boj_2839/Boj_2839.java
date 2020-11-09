package boj_2839;

import java.util.Scanner;

public class Boj_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ssal = sc.nextInt();
		int tmpSsal = ssal;
		int token = 0;
		
		int fiveBong = 0;
		int threeBong = 0;
		
		for( ; ssal >=3 ; ssal -= 3, threeBong++) {
			if(ssal == 3) {
//				if((threeBong * 3) == tmpSsal) System.out.println(threeBong);
				
			}
			if(ssal % 5 == 0) {
				fiveBong = ssal / 5;
//				System.out.println(fiveBong + threeBong);
				break;
			} 
		}
		
		if((fiveBong * 5) + (threeBong * 3) != tmpSsal) System.out.println("-1");
		else System.out.println(fiveBong + threeBong);
	}
}
