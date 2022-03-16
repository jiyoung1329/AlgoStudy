import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = N;

        for (int i = 0; i < N; i++) {
            boolean[] chs = new boolean[26];
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (!chs[ch - 97]) {
                    chs[ch - 97] = true;
                } else {
                    if (ch != str.charAt(j - 1)) {
                        count--;
                        break;

                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }

}
