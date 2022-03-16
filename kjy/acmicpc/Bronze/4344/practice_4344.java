package basic_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class practice_4344 {
	public static void main(String[] args) throws Exception {
		
		String[] Arr;
		int[] Scores;
		int T, N;
		float sum, avg, percent, cnt;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			Arr = br.readLine().split(" ");
			N = Integer.parseInt(Arr[0]);
			
			Scores = new int[N];
			cnt = 0;
			sum = 0;
			for (int j=1; j<=N; j++) {
				Scores[j-1] = Integer.parseInt(Arr[j]);
				sum += Scores[j-1];
			}
			avg = sum / (float) N;
			for (int j=0; j<N; j++) {
				if (Scores[j] > avg) cnt += 1;
			}
			
			System.out.printf("%.3f%%\n", (cnt/N)*100);
			
		}
		
	}

}
