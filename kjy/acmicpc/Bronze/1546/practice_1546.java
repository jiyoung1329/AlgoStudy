package Array1D_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practice_1546 {

	static double Avg, Score, MaxScore, Sum;
	static int N;
	static String[] Scores;
	static double[] NewScores;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Scores = br.readLine().split(" ");
		
		NewScores = new double[N];
		MaxScore = 0;
		Sum = 0;
		
		for (int i=0; i<N; i++) {
			NewScores[i] = Integer.parseInt(Scores[i]);
			if (NewScores[i] > MaxScore) MaxScore = NewScores[i];
		}
		for (int i=0; i<N; i++) {
			Sum += (NewScores[i] / MaxScore * 100);
		}
		Avg = Sum / N;
		System.out.println(Avg);
		
	}

}
