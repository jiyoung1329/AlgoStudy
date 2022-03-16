import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int[][] people = new int[15][15];
        for (int i = 0; i < 15; i++)
            people[0][i] = i;
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 15; j++)
                people[i][j] = 0;
        }

        int T = Integer.parseInt(br.readLine());

        int K, N, sum;
        // K층 N호
        for (int i = 0; i < T; i++) {
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());

            sum = 0;
            for (int k = 1; k <= K; k++) {
                for (int n = 1; n <= N; n++) {

                    if (people[k][n] == 0) {
                        people[k][n] = people[k][n - 1] + people[k - 1][n];
                    }
                }

            }
            System.out.println(people[K][N]);

        }
    }
}