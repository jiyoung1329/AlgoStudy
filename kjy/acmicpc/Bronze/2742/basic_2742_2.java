package basic_practice;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class basic_2742_2 {
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for (int i=N; i>0; i--) {
			sb.append(i).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		
	}
}
