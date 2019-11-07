package hw.d1023;

class Cal {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public String div(int a, int b) {
		String result = "";

		if (b == 0) {
			result = "0 으로 나눌 수 없습니다.";
		} else if (a % b == 0) {
			result += (a / b);
		} else {
			result += ((double) a / b);
		}

		return result;
	}
}

public class HW_ObjectTest {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(30, 20));
		System.out.println(c.mul(10, 20));
		System.out.println(c.div(3, 2));
		System.out.println(c.div(4, 2));
	}

}
