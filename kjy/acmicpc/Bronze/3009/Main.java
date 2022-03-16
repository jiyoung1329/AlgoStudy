import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp;
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            tmp = br.readLine().split(" ");
            x[i] = Integer.parseInt(tmp[0]);
            y[i] = Integer.parseInt(tmp[1]);
        }

        int ansx = 0, ansy = 0;
        if (x[0] == x[1])
            ansx = x[2];
        else if (x[1] == x[2])
            ansx = x[0];
        else if (x[0] == x[2])
            ansx = x[1];

        if (y[0] == y[1])
            ansy = y[2];
        else if (y[1] == y[2])
            ansy = y[0];
        else if (y[0] == y[2])
            ansy = y[1];

        System.out.println(ansx + " " + ansy);

    }
}
