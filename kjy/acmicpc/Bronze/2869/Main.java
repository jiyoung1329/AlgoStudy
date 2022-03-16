import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strarr = br.readLine().split(" ");
        int A, B, V;
        A = Integer.parseInt(strarr[0]);
        B = Integer.parseInt(strarr[1]);
        V = Integer.parseInt(strarr[2]);

        // 2 1 / 3 2 / 4 3 / 5
        int day = (int) (V - A) / (A - B);
        int now = (A - B) * day;
        while (true) {
            day++;
            now += A;
            if (now >= V)
                break;
            else {
                now -= B;
            }
        }
        System.out.println(day);

    }
}
