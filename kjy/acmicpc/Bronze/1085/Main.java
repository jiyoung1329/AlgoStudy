import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[4];

        int i = 0;
        for (String s : br.readLine().split(" ")) {
            input[i++] = Integer.parseInt(s);
        }

        input[2] -= input[0];
        input[3] -= input[1];
        int min = input[0];
        for (i = 0; i < 4; i++) {
            if (input[i] < min)
                min = input[i];
        }
        System.out.println(min);

    }
}