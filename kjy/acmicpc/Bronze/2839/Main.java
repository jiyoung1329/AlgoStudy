import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // ans1(N);
        ans2(N);
    }

    public static void ans1(int N) {
        int ans = -1;
        // 봉지는 3 or 5키로
        int three = N / 3;
        int five = N / 5;

        for (int i = five; i >= 0; i--) {
            for (int j = three; j >= 0; j--) {
                if (N == (i * 5 + j * 3)) {
                    if (ans == -1 || ans > i + j)
                        ans = i + j;
                }

            }
        }
        System.out.println(ans);
    }

    public static void ans2(int N) {
        int num3 = 0, num5 = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                num5 = N / 5;
                break;
            }
            N -= 3;
            num3++;
        }
        if (N >= 0)
            System.out.println(num3 + num5);
        else
            System.out.println(-1);

    }
}