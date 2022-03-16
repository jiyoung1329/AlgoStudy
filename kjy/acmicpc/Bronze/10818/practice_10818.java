package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class practice_10818 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		sb.append(Arrays.stream(nums).min().getAsInt()).append(" ");
		sb.append(Arrays.stream(nums).max().getAsInt());
		
		System.out.println(sb);
	}
	
}
