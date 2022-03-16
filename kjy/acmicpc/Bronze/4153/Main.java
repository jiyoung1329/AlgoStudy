import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmp;
        int x1, x2, x3;
        int big, small1, small2;
        while (true) {
            tmp = br.readLine().split(" ");
            x1 = Integer.parseInt(tmp[0]);

            if (x1 == 0)
                break;

            x2 = Integer.parseInt(tmp[1]);
            x3 = Integer.parseInt(tmp[2]);

            if (x1 > x2 && x1 > x3) {
                big = x1;
                small1 = x2;
                small2 = x3;
            } else if (x2 > x3) {
                big = x2;
                small1 = x1;
                small2 = x3;
            } else {
                big = x3;
                small1 = x1;
                small2 = x2;
            }

            if (big * big == (small1 * small1 + small2 * small2)) {
                bw.write("right" + "\n");
            } else {
                bw.write("wrong" + "\n");
            }
        }
        bw.close();
    }

}
