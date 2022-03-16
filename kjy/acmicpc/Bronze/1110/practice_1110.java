package while_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_1110 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int NewNum = N;
		int cnt = 0;
		
		while (true) {
			NewNum = ((NewNum % 10) * 10) + (((NewNum / 10) + (NewNum % 10)) %10);
			cnt += 1;
			if (NewNum == N) break;
			
		}
		System.out.println(cnt);
	}
	
}