import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int MAX = 2000001;

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[MAX];

        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            arr[num + 1000000] = true;
        }

        for (int i = 0; i < MAX; i++) {
            if (arr[i])
                sb.append((i - 1000000) + "\n");
        }
        System.out.println(sb);

        // for (int i = 0; i < N; i++) {
        // arr.add(Integer.parseInt(br.readLine()));
        // }
        // Collections.sort(arr);

        // for (int i : arr) {
        // sb.append(i + "\n");
        // }
        // System.out.println(sb);

    }
}
