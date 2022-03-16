package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_2577_2 {
	
	static long A, B, C;
	static int[] countArr;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		countArr = new int[10];
		
		String temp = String.valueOf(A*B*C);
		
		for (int i=0; i<temp.length(); i++) {
			int idx = Integer.parseInt(temp.substring(i, i+1));
			countArr[idx]++;
		}
		
		for (int i=0; i<=9; i++) {
			System.out.println(countArr[i]);
		}
		
		
	}

}
