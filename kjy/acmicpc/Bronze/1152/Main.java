import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
		
		int cnt=0;
		String[] strlist;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		strlist = br.readLine().split(" ");
		for (int i=0; i<strlist.length; i++) {
			if (!strlist[i].isEmpty()) cnt ++;
		}
		
		System.out.println(cnt);
		
	}

}
