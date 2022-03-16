package basic_practice;

public class basic_1000 {
	public static void main(String[] args) throws Exception{
		byte[] num = {0, 0, 0};
		
		String str1 = new String(num);
		System.out.println(str1);
		System.out.println(num);
		System.out.println(num[0]+num[1]+num[2]);
		System.in.read(num);
		System.out.println(num[0]);
		
	}
}
