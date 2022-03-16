package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_2562 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos=0, maxnum=0;
		
		for (int i=1; i<=9; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num >= maxnum) {
				maxnum = num;
				pos = i;
			}
		}
		
		System.out.println(maxnum);
		System.out.println(pos);
	}

}
