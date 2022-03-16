import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        // 1/1 -> 2 1
        // 1/2 2/1 -> 3 2
        // 3/1 2/2 1/3 -> 4 3
        // 1/4 2/3 3/2 4/1 -> 5
        // 5/1 4/2 3/3 2/4 1/5 -> 6

        int i = 0, a = 1;

        while (true) {
            if (X - a > 0) {
                X -= a;
                a++;
            } else {
                a++;
                break;
            }
        }

        if (a % 2 == 0) {
            System.out.println((a - X) + "/" + (X));
        } else {
            System.out.println(X + "/" + (a - X));

        }

    }
}