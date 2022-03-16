package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_1546_2 {

	static float Score, MaxScore, Sum;
	static int N;
	static String[] Scores;
	static double[] NewScores;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Scores = br.readLine().split(" ");
		
		MaxScore = 0;
		Sum = 0;
		
		for (int i=0; i<N; i++) {
			Score = Integer.parseInt(Scores[i]);
			Sum += Score;
			if (Score > MaxScore) MaxScore = Score;
		}
		System.out.println((Sum / MaxScore / N) * 100);
		
	}

}
