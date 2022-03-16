package basic_practice;

import java.io.InputStreamReader;
//import java.util.Arrays;
import java.io.BufferedReader;
public class basic_10430 {
	public static void main(String[] args) throws Exception{
		String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		
//		System.out.println(Arrays.toString(param));
		
		int a = Integer.parseInt(param[0]);
		int b = Integer.parseInt(param[1]);
		int c = Integer.parseInt(param[2]);
		
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

}
