package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_2739 {
	public static void main(String[] args) throws Exception{
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		for (int i=1; i < 10; i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
	}

}
