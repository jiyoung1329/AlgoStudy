package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic_2753 {
	public static void main(String[] args) throws Exception{
		int year = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) System.out.println(1);
		else System.out.println(0);
	}
}
