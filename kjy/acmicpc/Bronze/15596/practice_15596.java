package function_practice;

public class practice_15596 {


    long sum(int[] a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) ans += a[i];
        return ans;
    }


	public static void main(String[] args) {
		practice_15596 mytest = new practice_15596();
		System.out.println(mytest.sum(new int[] {1, 1, 1})); 
	}

}
