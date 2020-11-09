import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10870 {
	
	static int fibonacci(int inputNum) {
		if(inputNum == 0) return 0;
		else if(inputNum == 1) return 1;
		else return fibonacci(inputNum - 2) + fibonacci(inputNum - 1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(inputNum));
	}
}
