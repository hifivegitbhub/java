package d1014;

public class VariableTest5 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int result = a + b;
		System.out.println("a+b=" + result);
		
		byte su1 = 10, su2 = 20;
		int result2 = su1 + su2; // ������ �Ͼ�� int Ÿ������ ����Ǿ� ����ϹǷ� int�� �޾���� ��.
		System.out.println("a+b=" +result2);
		
		short su3 = 20;
		short su4 = 40;
		int result3 = su3 + su4;
		
		int su5 = 20;
		long su6 = 30L;
		long result4 = su5 + su6; // int�� long ����� long���� ����� ����
		
		float su7 = 10;
		long su8 = 300;
		float result5 = su7 + su8;
		double result6 = su7 + su8;
		System.out.println(result5);
		System.out.println(result6);
	}

}
