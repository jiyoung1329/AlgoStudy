import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b, c;
        String[] strs = br.readLine().split(" ");
        a = Integer.parseInt(strs[0]);
        b = Integer.parseInt(strs[1]);
        c = Integer.parseInt(strs[2]);
        // a + b * x <= c * x
        // * x >= a / (c-b)
        if (c <= b)
            bw.write("-1");
        else {
            bw.write(Integer.toString((int) Math.floor((a / (c - b))) + 1));
        }

        bw.flush();
        bw.close();

    }

}
