import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int idx, tmp;
        for (int i = 0; i < N - 1; i++) {
            idx = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[idx]) {
                    idx = j;
                }
            }
            tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;

            sb.append(nums[i] + "\n");
        }
        sb.append(nums[N - 1]);
        System.out.println(sb);
    }
}
