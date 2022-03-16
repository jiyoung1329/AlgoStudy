package while_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class practice_10951 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String param;
		
		while ((param=br.readLine()) != null) {
			st = new StringTokenizer(param, " ");
			if (st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				sb.append(a+b+"\n");
			} else break;
			
		}
		System.out.println(sb);
		
	}
}
