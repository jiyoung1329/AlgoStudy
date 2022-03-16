import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws Exception{
		
		boolean isequal=false;
		int maxcount = 0, maxidx=0;
		char tmp;
		String str, strlist;
		int[] check;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		strlist = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		check = new int[26];
		
		for (int i=0; i<str.length(); i++) {
			tmp = str.charAt(i);
			if (tmp >= 97) check[tmp-97] ++;
			else if (tmp >= 65) check[tmp-65] ++;
			
		}
		
		for (int i=0; i<26; i++) {
			if (check[i] > maxcount) {
				isequal = false;
				maxcount = check[i];
				maxidx = i;
			}
			else if (check[i] == maxcount) isequal = true;
		}
		
		if (isequal) System.out.println("?");
		else System.out.println(strlist.charAt(maxidx));
		System.out.println((char) 63);
		
	}
}
