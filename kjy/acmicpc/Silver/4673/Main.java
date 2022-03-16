public class Main {

	static boolean[] Check;

	public int NumRule(int a) {
		int sum = a;

		while (a != 0) {
			sum += (a % 10);
			a /= 10;
		}

		return sum;
	}

	public static void main(String[] args) throws Exception {
		practice_4673 test = new practice_4673();
		StringBuilder sb = new StringBuilder();

		Check = new boolean[10001];
		for (int i = 1; i <= 10000; i++) {
			int ans = test.NumRule(i);
			if (ans <= 10000 && !Check[ans])
				Check[ans] = true;
		}
		for (int i = 1; i <= 10000; i++) {
			if (!Check[i])
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
