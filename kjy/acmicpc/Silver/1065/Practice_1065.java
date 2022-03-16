import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public boolean CheckNum(int Num) {
		boolean check = false;
		int a = Num / 100;
		int b = (Num / 10) % 10;
		int c = Num % 10;

		if (Num < 1000 && ((a - b) == (b - c)))
			check = true;

		return check;
	}

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int cnt = 0;
		Main test = new Main();

		if (N < 100)
			System.out.println(N);
		else {
			for (int i = 100; i <= N; i++) {
				if (test.CheckNum(i))
					cnt += 1;
			}
			System.out.println(99 + cnt);
		}

	}

}
