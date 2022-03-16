package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class practice_8958 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] Results;
		int cnt, sum;
		
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; i++) {
			
			cnt = 0;
			sum = 0;
			
			Results = br.readLine().split("");
			for (int j=0; j<Results.length; j++) {
				if (Results[j].equals("O")) {
					cnt += 1;
					sum += cnt;
				}
				else cnt = 0;
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
