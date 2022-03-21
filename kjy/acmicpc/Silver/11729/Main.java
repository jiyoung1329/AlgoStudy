import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    // 하노이탑 규칙
    // 1. n개의 탑을 1(start)에서 3(end)로 옮기려고 한다.
    // 2. (n-1)개 탑을 1(start)에서 2(mid)로 옮기고
    // 3. 제일 큰판(n)을 1(start)에서 3(end)로 옮긴다.
    // 4. (n-1)개의 탑을 2(mid)에서 3(end)로 옮긴다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(1);
        } else {
            System.out.println((int) Math.pow(2, N) - 1);
        }

        hanoi(bw, N, 1, 3, 2);
        bw.close();

    }

    public static void hanoi(BufferedWriter bw, int n, int start, int end, int mid) throws IOException {
        if (n == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }
        // n-1판을 start에서 mid로 옮기고
        hanoi(bw, n - 1, start, mid, end);
        // 제일 큰 판을 start에서 end로 옮기고
        bw.write(start + " " + end + "\n");
        // (n-1)개 판들을 mid에서 end로 옮긴다.
        hanoi(bw, n - 1, mid, end, start);
    }

}
