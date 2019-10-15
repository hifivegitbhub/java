package d1014;

public class VariableTest {

	public static void main(String[] args) {
		//char(2byte)는 int로 형변환 가능
		byte a = 127; //initialization
		int b = 20;
		System.out.println(a);
		a = 30;
		System.out.println(a);
		int c = 1;
		char c2 = 'A';
		c = c2;
		System.out.println(c);
		int t1 = 10, t2 = 20, t3 = 30;
		System.out.println("t : " + t1 + t2 + t3);
		
	}

}
