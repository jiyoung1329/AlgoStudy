package basic_practice;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class basic_2742 {
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i=N; i>0; i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		
	}
}
