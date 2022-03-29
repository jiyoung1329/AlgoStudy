import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 0;
        int num = 665;
        while (i < N) {
            num++;
            if (checkNum(num)) {
                i++;
            }
        }
        System.out.println(num);
    }

    public static boolean checkNum(int num) {
        int check = 0;
        while (num > 0) {
            if (num % 10 == 6) {
                check++;
            } else {
                check = 0;
            }
            if (check >= 3)
                return true;
            num /= 10;
        }
        return false;
    }

}
