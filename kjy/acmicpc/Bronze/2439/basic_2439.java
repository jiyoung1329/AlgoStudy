package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_2439 {
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=N-i; j++) {
				sb.append(" ");
			}
			for (int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
