package basic_practice;

import java.util.Scanner;
import java.io.IOException;
public class basic_2588 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b / 10) % 10));
		System.out.println(a * (b / 100));
		
		System.out.println(a * b);
	}
}
