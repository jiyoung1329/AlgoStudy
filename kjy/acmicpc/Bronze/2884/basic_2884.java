package basic_practice;

import java.io.InputStreamReader; 
import java.io.BufferedReader;
public class basic_2884 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] param = br.readLine().split(" ");
		int hour = Integer.parseInt(param[0]);
		int min = Integer.parseInt(param[1]);
	
		min = min - 45;
		if (min < 0) {
			min += 60;
			hour -= 1;
		}
		if (hour < 0) hour += 24;
		
		System.out.println(hour + " " + min);
	}
}
