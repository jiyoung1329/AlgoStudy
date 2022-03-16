import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] PrimeNum = new boolean[10001];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 2; i <= 10000; i++) {
            if (IsPrime(i))
                PrimeNum[i] = true;
        }

        int n;
        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            func(n);
        }

        System.out.println(sb);
    }

    public static boolean IsPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void func(int n) {
        for (int i = n / 2;; i--) {
            if (PrimeNum[i] && PrimeNum[n - i]) {
                sb.append(i + " " + (n - i) + "\n");
                return;
            }
        }
    }

}