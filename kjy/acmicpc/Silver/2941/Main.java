import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str = br.readLine();
        // c=, c-, dz=, d-, lj, nj, s=, z=
        int cnt = 0;
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            try {

                if (ch == 'c') {
                    if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                        i += 2;
                    } else {
                        i++;
                    }
                } else if (ch == 'd') {
                    if (str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                        i += 3;
                    } else if (str.charAt(i + 1) == '-') {
                        i += 2;
                    } else {
                        i++;
                    }
                } else if (ch == 'l' || ch == 'n') {
                    if (str.charAt(i + 1) == 'j') {
                        i += 2;
                    } else {
                        i++;
                    }
                } else if (ch == 's' || ch == 'z') {
                    if (str.charAt(i + 1) == '=') {
                        i += 2;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            } catch (Exception e) {
                i++;
            }
            cnt++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
