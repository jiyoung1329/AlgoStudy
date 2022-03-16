import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int T, R;
		String S;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			StringBuilder sb = new StringBuilder();
			String[] temp = br.readLine().split(" ");
			R = Integer.parseInt(temp[0]);
			S = temp[1];

			for (int i = 0; i < S.length(); i++) {

				char ch = S.charAt(i);

				for (int j = 0; j < R; j++)
					sb.append(ch);
			}

			System.out.println(sb);
		}

	}

}
