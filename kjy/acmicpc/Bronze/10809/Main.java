import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws Exception{
		String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		StringBuilder sb = new StringBuilder();
		
		int[] check = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for (int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if (check[tmp-97] == -1) check[str.charAt(i)-97] = i;
		}
		
		for (int i=0; i<26; i++) sb.append(check[i]).append(" ");		
		System.out.println(sb);
	}
	

}
