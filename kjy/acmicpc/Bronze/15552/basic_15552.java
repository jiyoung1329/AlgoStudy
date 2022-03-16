package basic_practice;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class basic_15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter otbw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(inbr.readLine());
		for (int i=0; i<T; i++) {
			String[] Nums = inbr.readLine().split(" ");
			otbw.write(Integer.parseInt(Nums[0]) + Integer.parseInt(Nums[1])+"\n");
		}
		
		inbr.close();
		otbw.flush();
		otbw.close();
	}

}
