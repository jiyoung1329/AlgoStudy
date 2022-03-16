package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_2577 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] posnum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int Result=1, tmp;
		for (int i=0; i<3; i++) {
			Result *= Integer.parseInt(br.readLine());
		}
		while (Result != 0) {
			tmp = Result % 10;
			Result /= 10;
			posnum[tmp] += 1;
			
		}
		for (int i=0; i<=9; i++) {
			sb.append(posnum[i]).append("\n");
		}
		System.out.println(sb);
	}
}
