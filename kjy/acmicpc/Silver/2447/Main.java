import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append(printStar(N, r, c));
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static char printStar(int N, int r, int c) {
        char star = '*';
        char blank = ' ';
        if (N == 3) {
            if (r == 1 && c == 1)
                return blank;
            else
                return star;
        } else {
            int nextN = N / 3;
            if (r / nextN == 1 && c / nextN == 1) {
                return blank;
            } else {
                return printStar(nextN, r % nextN, c % nextN);
            }

        }
    }
}
