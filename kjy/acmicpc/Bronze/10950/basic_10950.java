package basic_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class basic_10950 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N; i++) {
			String[] param = br.readLine().split(" ");
			int A = Integer.parseInt(param[0]);
			int B = Integer.parseInt(param[1]);
			System.out.println(A+B);
		}
	}
}
