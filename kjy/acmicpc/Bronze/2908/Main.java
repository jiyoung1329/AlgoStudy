import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		int num1, num2;
		num1 = Integer.parseInt(new StringBuffer(s[0]).reverse().toString());
		num2 = Integer.parseInt(new StringBuffer(s[1]).reverse().toString());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		if (num1 > num2)
			bw.write(String.valueOf(num1));
		else
			bw.write(String.valueOf(num2));
		bw.flush();
		bw.close();

	}
}
