import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int max = M;
        int i = 0;
        int[] cards = new int[N];
        for (String num : br.readLine().split(" ")) {
            cards[i++] = Integer.parseInt(num);
        }
        System.out.println(blackJack(N, M, cards));
    }

    public static int blackJack(int N, int M, int[] cards) {
        int max = 0;
        int sum;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (max < sum && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        return max;
    }

}