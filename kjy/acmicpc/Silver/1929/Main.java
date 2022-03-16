import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] tmp = br.readLine().split(" ");
        int M = Integer.parseInt(tmp[0]);
        int N = Integer.parseInt(tmp[1]);

        for (int i = M; i <= N; i++) {
            if (IsPrime(i)) {
                sb.append(i + "\n");
            }
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
}