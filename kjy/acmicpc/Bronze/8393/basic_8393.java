package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_8393 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for (int i=1; i<N+1; i++) sum += i;
		System.out.println(sum);
	}

}
