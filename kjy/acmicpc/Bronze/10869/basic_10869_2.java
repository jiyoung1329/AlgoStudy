package basic_practice;

import java.io.InputStreamReader;
//import java.util.Arrays;
import java.io.BufferedReader;
public class basic_10869_2 {
	public static void main(String[] args) throws Exception{
		String[] param = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		
//		System.out.println(Arrays.toString(param));
		int a = Integer.parseInt(param[0]);
		int b = Integer.parseInt(param[1]);
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

}
