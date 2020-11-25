import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lhun {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int testCaseCnt = Integer.parseInt(bf.readLine());

		String[] cardNumber = new String[testCaseCnt];
		char[][] splitStr = new char[testCaseCnt][];
		char[] tOrF = new char[testCaseCnt];

		int z = 0;
		//���ڿ��� �ɰ��� char�迭�� �����Ѵ�.
		while (z < testCaseCnt) {
			cardNumber[z] = bf.readLine();
			
			if(cardNumber[z].contains("-")) {
				cardNumber[z] = cardNumber[z].replaceAll("-", "");
			}
			
			splitStr[z] = cardNumber[z].toCharArray();
			z++;
		}
		
		for(int i = 0 ; i < testCaseCnt ; i++) {
			for(int j = 0 ; j < splitStr[i].length ; j++) {
				System.out.print(splitStr[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < testCaseCnt; i++) {
			int sum = 0;

			//ī���ȣ�� �����ʿ�������  index(15)���� -1�� �����ϸ� �˻� 
			for (int j = splitStr[i].length - 1 ; j >= 0; j--) {
				
				// char to int
				int charToInt = splitStr[i][j] - '0';

				// �����ʿ��� ���� ¦�� index�� ������
				if (j % 2 == 0) {
					// ¦������ *2 ���� 10���� ũ�ٸ� 10�� �ڸ�, 1�� �ڸ� �ɰ��� ����
					if ((charToInt * 2) >= 10) {
						charToInt *= 2;
						sum +=  (charToInt / 10) + (charToInt) % 10;
					//10���� �۴ٸ� �׳� 2�� �Ͽ� ���� 	
					} else
						sum += charToInt * 2;
				// �����ʿ��� ���� Ȧ�� index�� �׳� ���� 
				} else
					sum += charToInt;
			}
			
			// 10���� ���� �������� 0�̶�� T���� 
			if (sum % 10 == 0)
				tOrF[i] = 'T';
			else
				tOrF[i] = 'F';
		}

		for (int i = 0; i < testCaseCnt; i++) {
			System.out.println(tOrF[i]);
		}
	}
}
