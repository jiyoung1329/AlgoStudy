package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1330 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] param = br.readLine().split(" ");
		int a = Integer.parseInt(param[0]);
		int b = Integer.parseInt(param[1]);

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");

	}
}
