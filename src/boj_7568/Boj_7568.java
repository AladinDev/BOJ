package boj_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[][] str = new String[N][2];
		int[][] strToInt = new int[N][2];

		int[] k = new int[N];

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine().split(" ");
			for (int j = 0; j < 2; j++) {
				strToInt[i][j] = Integer.parseInt(str[i][j]);
			}
		}
		int index = 0;

		while (true) {
			if (index >= N)
				break;
			for (int i = 0; i < N; i++)
				if (strToInt[index][0] < strToInt[i][0] && strToInt[index][1] < strToInt[i][1])
					k[index]++;
			index++;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(++k[i] + " ");
		}
	}
}
