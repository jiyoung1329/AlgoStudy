import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        String[] tmp;
        int x1, y1, r1, x2, y2, r2;
        for (int i = 0; i < T; i++) {
            tmp = br.readLine().split(" ");
            x1 = Integer.parseInt(tmp[0]);
            y1 = Integer.parseInt(tmp[1]);
            r1 = Integer.parseInt(tmp[2]);
            x2 = Integer.parseInt(tmp[3]);
            y2 = Integer.parseInt(tmp[4]);
            r2 = Integer.parseInt(tmp[5]);

            double dist1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double dist2 = r1 + r2;
            double dist3 = r2 > r1 ? r2 - r1 : r1 - r2;

            if (dist1 == 0) {
                if (r1 == r2) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }

            } else if (Double.compare(dist1, dist2) == 0 || Double.compare(dist1, dist3) == 0) {
                bw.write(1 + "\n");
            } else if (Double.compare(dist1, dist2) < 0 && Double.compare(dist1, dist3) > 0) {
                bw.write(2 + "\n");
            } else {
                bw.write(0 + "\n");

            }

        }
        bw.close();

    }
}
