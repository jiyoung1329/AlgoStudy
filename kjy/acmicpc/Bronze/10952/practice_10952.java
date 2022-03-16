package while_practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_10952 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		
		while (true) {
			String[] param = br.readLine().split(" ");
			int a = Integer.parseInt(param[0]);
			int b = Integer.parseInt(param[1]);
			
			if (a == 0 && b == 0) break;
			
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}

}
