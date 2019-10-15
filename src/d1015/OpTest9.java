package d1015;

public class OpTest9 {
	public static void main(String[] args) {
		int a = 7, b = 5;
		int result;
		result = a > b ? a : b;
		System.out.println(result);

		int su = 10;
		String result2 = (su > 5) ? "5보다 큽니다." : "5보다 작습니다.";
		System.out.println(result2);

		int aa = 7, bb = 5, cc = 8;
		int min, max;

		min = (aa < bb) ? ((aa < cc) ? aa : cc) : bb;
		max = (aa > bb) ? ((aa > cc) ? aa : cc) : bb;

		System.out.println(min);
		System.out.println(max);

		int a1 = 10, b1 = 3, c1 = 5;

		a1 *= b1 + c1; // a1 = a1 * (b1+c1)
		System.out.println(a1); // 80
	}
}
