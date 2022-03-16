package basic_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class basic_11022 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			String[] params = br.readLine().split(" ");
			int a = Integer.parseInt(params[0]);
			int b = Integer.parseInt(params[1]);
			sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b)
					.append("\n");

		}

		System.out.println(sb);
	}

}
