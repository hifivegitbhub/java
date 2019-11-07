package hw.d1021;

class Method1 {
	public void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public void sub(int a, int b) {
		System.out.printf("%d - %d = %d\n", a, b, a - b);
	}

	public void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, a * b);
	}

	public void div(int a, int b) {
		float dbResult = 0.0f;
		int intResult = 0;

		if (b == 0) {
			System.out.println("0 으로 나눌 수 없습니다.");
		} else {
			dbResult = (float) a / b;
			intResult = a / b;

			if (dbResult == (float) intResult) {
				System.out.printf("%d / %d = %d\n", a, b, intResult);
			} else {
				System.out.printf("%d / %d = %.1f\n", a, b, dbResult);
			}
		}
	}
}

public class HW_Calculation {

	public static void main(String[] args) {
		Method1 m1 = new Method1();
		m1.add(10, 20);
		m1.sub(30, 20);
		m1.mul(5, 20);
		m1.div(3, 2);
	}

}
