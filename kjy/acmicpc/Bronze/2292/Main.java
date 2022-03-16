import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int func(int n) {
        return (1 + (3 * n * (n + 1)));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = 1;
        // 1, 2-7, 8-19, 20-37, 38-61
        // n * (n+1) /2 * 6
        // (n+1) * (n+2) / 2 * 6
        if (N == 1)
            System.out.println(1);
        else {
            while (func(ans - 1) >= N || N > func(ans)) {
                ans++;
            }
            System.out.println(ans + 1);

        }

    }
}
