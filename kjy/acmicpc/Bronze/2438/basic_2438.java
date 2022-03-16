package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_2438 {
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
			
		}
		System.out.println(sb);
		
	}

}
