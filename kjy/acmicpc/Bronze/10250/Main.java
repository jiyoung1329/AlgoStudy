import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int T = Integer.parseInt(br.readLine());

        String[] HWN = new String[3];
        int H, W, N;
        int h, w, ans;
        for (int i = 0; i < T; i++) {
            HWN = br.readLine().split(" ");
            H = Integer.parseInt(HWN[0]);
            W = Integer.parseInt(HWN[1]);
            N = Integer.parseInt(HWN[2]);

            h = N % H;
            w = ((int) N / H);
            if (N % H == 0) {
                System.out.println(H * 100 + w);
            } else {
                System.out.println(h * 100 + w + 1);
            }

        }

        // bw.flush();/
        // bw.close();
    }
}