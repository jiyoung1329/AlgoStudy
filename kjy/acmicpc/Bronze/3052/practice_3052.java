package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_3052 {

	static int cnt;
	static int[] checkArr;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		checkArr = new int[42];
		
		for (int i=0; i<10; i++) {
			int idx = Integer.parseInt(br.readLine()) % 42;
			if (checkArr[idx] == 0) {
				checkArr[idx] = 1;
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
