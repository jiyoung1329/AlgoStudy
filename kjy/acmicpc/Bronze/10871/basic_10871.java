package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_10871 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] params1 = br.readLine().split(" ");
		int N = Integer.parseInt(params1[0]);
		int X = Integer.parseInt(params1[1]);
		
		String[] param = br.readLine().split(" ");
		for (int i=0; i<N; i++) {
			int Num = Integer.parseInt(param[i]);
			if (Num < X) sb.append(Num).append(" ");
		}
		System.out.println(sb);
	}

}
