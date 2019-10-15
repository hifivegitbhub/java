package d1015;

public class OpTest6 {
	public static void main(String[] args) {
		boolean r1 = true;
		boolean r2 = false;
		
		boolean result1 = r1 && r2;
		boolean result2 = r1 || r2;
		boolean result3 = !r1;
		boolean result4 = r1 ^ r2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		boolean a = true;
		boolean b = false;
		int c = 10;
				
		boolean test = true;
		test &= b;
		System.out.println(test);
		
		int num = 10;
		num += c;
	}
}
